package heranca_e_polimorfismo.exercicios.exerciciovideo.model;

public class OutSourcedEmployee extends Employee{

    private double adicionalCharge;

    public OutSourcedEmployee(){
        super();
    }

    public OutSourcedEmployee(String name, int hour, double valuePerHour, double adicionalCharge){
        super(name, hour, valuePerHour);
        this.adicionalCharge = adicionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + adicionalCharge * 1.1;

    }

}
