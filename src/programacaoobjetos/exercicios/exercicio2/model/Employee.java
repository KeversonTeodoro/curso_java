package programacaoobjetos.exercicios.exercicio2.model;

public class Employee {
    public String name;
    public long wage;
    public double tax;

    public double netSalary(){
        return wage - tax;
    }

    public void increaseSlary(int porcentage){
        wage = wage * (1 + (porcentage / 100));

    }

}
