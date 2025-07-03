package heranca_e_polimorfismo.exerciciofixacao;
import heranca_e_polimorfismo.exerciciofixacao.model.Pessoa;
import heranca_e_polimorfismo.exerciciofixacao.model.PessoaFisica;
import heranca_e_polimorfismo.exerciciofixacao.model.PessoaJuridica;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Enter number people: ");
        int peopleNumber = input.nextInt();

        for (int i = 0; i < peopleNumber; i++) {

            System.out.print("Pessoa Fisíca ou Juridica (i/c)? ");
            char escolha = input.next().charAt(0);

            if(escolha == 'c'){
                System.out.println("Enter company data: ");
                input.nextLine();

                System.out.print("Name: ");

                String name = input.nextLine();
                System.out.print("Income: ");
                double income = input.nextDouble();

                System.out.print("Enter employee number: ");
                int numberEmployee = input.nextInt();
                pessoas.add(new PessoaJuridica(name, income, numberEmployee));

            }

            else if(escolha == 'i'){
                System.out.println("Enter individual data: ");
                input.nextLine();

                System.out.print("Name: ");

                String name = input.nextLine();
                System.out.print("Income: ");
                double income = input.nextDouble();

                System.out.print("Teve algum gasto com saude (y/n)? ");
                char escolhaGastoComSaude = input.next().charAt(0);

                if(escolhaGastoComSaude == 'y' || escolhaGastoComSaude == 'Y'){
                    System.out.print("Quantos ? ");
                    double gastoComSaude = input.nextDouble();
                    pessoas.add(new PessoaFisica(name, income, gastoComSaude));

                }


            }

        }

        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getName() + " - " + pessoa.calcularImposto());
        }



    }
}
