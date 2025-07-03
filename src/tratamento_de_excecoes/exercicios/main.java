package tratamento_de_excecoes.exercicios;

import tratamento_de_excecoes.exemplosvideo.problema_hotel.model.exception.DomainException;
import tratamento_de_excecoes.exercicios.model.entities.Account;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws NoSuchElementException {
        Scanner input = new Scanner(System.in);


        try{
            System.out.println("Enter account data: ");

            System.out.print("Number: ");
            int number = input.nextInt();

            System.out.print("Holder: ");
            input.nextLine();
            String holder = input.nextLine();

            System.out.print("WithDraw Limit: ");
            double limit = input.nextDouble();

            System.out.print("balance: ");
            double initialDeposit = input.nextDouble();


            Account conta = new Account(number, holder, limit, initialDeposit);
            System.out.println(conta);



            conta.deposit();
            System.out.println(conta);

            System.out.print("Saque um valor: ");
            int saque = input.nextInt();
            conta.withdraw(saque);
            System.out.println(conta);
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }
        catch (NoSuchElementException w){
            System.out.println("Erro ao passar valores, input fechando antes da hora");
        }




    }
}
