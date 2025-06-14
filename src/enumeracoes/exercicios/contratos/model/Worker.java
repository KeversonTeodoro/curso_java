package enumeracoes.exercicios.contratos.model;

import enumeracoes.exercicios.contratos.entities_enum.WorkerLevel;

import javax.xml.crypto.Data;
import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sumContract = 0;
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : contracts){
            Date data = (Date) contract.getData();
            calendar.setTime(data);
            int mes = 1 + (int) calendar.get(Calendar.MONTH);
            int ano = (int) calendar.get(Calendar.YEAR);
            if(mes == month && ano == year){
                sumContract += contract.totalValue();
            }
        }
        return sumContract + baseSalary;

    }
}
