package interfaces.exercicios.exercicio_de_fixacao.model.entitie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private int number;
    private LocalDate dateContract;
    private double totalContract;

    private Parcela parcela;
    private List<Parcela> parcelas = new ArrayList<>();

    public Contrato(int number, double totalContract, LocalDate dateContract, Parcela parcela) {

        this.number = number;
        this.totalContract = totalContract;
        this.dateContract = dateContract;
        this.parcela = parcela;
    }

    public Contrato(){

    }

    public LocalDate getDateContract() {
        return dateContract;
    }

    public void setDateContract(LocalDate dateContract) {
        this.dateContract = dateContract;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTotalContract() {
        return totalContract;
    }

    public void setTotalContract(double totalContract) {
        this.totalContract = totalContract;
    }

    public Parcela getParcela() {
        return parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}
