package programacaoobjetos.exercicios.exercicioencapsulamento.model;

public class BankAccount {
    private int number;
    private String name;
    private double valor;

    public BankAccount(){

    }


    public BankAccount(int number, String name){
        this.number = number;
        this.name = name;
    }

    public BankAccount(int number, String name, double valorInicial){
        this.number = number;
        this.name = name;
        deposito(valorInicial);
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValor(){
        return valor;
    }


    public void sacar(double value){
        this.valor -= value + 5.00;
    }

    public void deposito(double valor){
        this.valor += valor;
    }
}
