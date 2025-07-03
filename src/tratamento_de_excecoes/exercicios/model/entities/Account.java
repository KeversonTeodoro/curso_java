package tratamento_de_excecoes.exercicios.model.entities;

import tratamento_de_excecoes.exemplosvideo.problema_hotel.model.exception.DomainException;

import java.text.ParseException;
import java.util.Scanner;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(){

    }

    public Account(int number, String holder, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }



    public Account(int number, String holder, double withdrawLimit, double balance) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(int amout) throws DomainException {

            System.out.println("========== METODO WITHDRAW ==========");

            if (amout > withdrawLimit){
                throw new DomainException("Valor do saque esta maior que O limite");

            }
            else {
                this.balance -= amout;

            }



    }

    public void deposit(){
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("======== METODO DEPOSITO ========");
            System.out.print("Enter amount deposit: ");
            double amount = input.nextDouble();
            this.balance += amount;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("========== FIM DE DEPOSITO ===========");

        }
    }

    @Override
    public String toString(){
        return "Number: "
                + number
                + ", "
                + "Holder: "
                + holder
                + ", "
                + "Balance: "
                + balance
                + ", "
                + "WithDraw limit: "
                + withdrawLimit;
    }
}
