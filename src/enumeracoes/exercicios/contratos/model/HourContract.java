package enumeracoes.exercicios.contratos.model;

import java.util.Date;
import java.util.HashMap;

public class HourContract {
    private Date data;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){

    }

    public HourContract(Date data, Double valuePerHour, Integer hours) {
        this.data = data;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getData() {
        return data;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }
}
