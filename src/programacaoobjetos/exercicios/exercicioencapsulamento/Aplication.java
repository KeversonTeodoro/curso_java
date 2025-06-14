package programacaoobjetos.exercicios.exercicioencapsulamento;

import programacaoobjetos.exercicios.exercicioencapsulamento.model.BankAccount;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();

        String nome = input.nextLine();
        int number = input.nextInt();

        System.out.println("Quer fazer deposito inicial: y/n");
        char response = input.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter the initial depositi: ");
            double initialDeposit = input.nextDouble();
            account = new BankAccount(number, nome, initialDeposit);
            System.out.println(account.getValor());

        }
        else{
            account = new BankAccount(number, nome);
        }

        System.out.println("digite o valor a ser depositado");
        double valorDeposito = input.nextDouble();
        account.deposito(valorDeposito);
        System.out.println(account.getValor());

        System.out.print("Valor a ser sacado: ");
        double withdrewValue = input.nextDouble();
        account.sacar(withdrewValue);
        System.out.println(account.getValor());





    }
}
