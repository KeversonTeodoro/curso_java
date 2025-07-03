package desafioJoaoBackEnd;

import desafioJoaoBackEnd.model.Caminhao;
import desafioJoaoBackEnd.model.Carro;
import desafioJoaoBackEnd.model.Moto;
import desafioJoaoBackEnd.model.Veiculo;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CarroApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Veiculo> veiculos = new ArrayList<>();

        System.out.print("Quanto veiculos quer Alugar? ");
        int numeroVeiculos = input.nextInt();

        for (int i = 0; i < numeroVeiculos; i++) {
            System.out.print("O que você quer alugar - Carro, Caminhão ou Moto? ");
            input.nextLine();

            String qualVeiculo = input.nextLine();


            System.out.print("Modelo: ");
            String modelo = input.nextLine();

            System.out.print("preço diário: ");
            double precoDiario = input.nextDouble();

            System.out.print("placa: ");

            String placa = input.next();

            System.out.println("quer andar (y/n) ? ");
            char andarEscolha = input.next().charAt(0);


            if(Objects.equals(qualVeiculo, "carro")){

                Veiculo carro1 = new Carro(modelo, precoDiario, placa);
                veiculos.add(carro1);


                if (andarEscolha == 'y' || andarEscolha == 'Y'){
                    System.out.println(carro1.mover());
                }
            }

            if(Objects.equals(qualVeiculo, "moto")){

                Veiculo moto1 = new Moto(modelo, precoDiario, placa);
                veiculos.add(moto1);

                if (andarEscolha == 'y' || andarEscolha == 'Y'){
                    System.out.println(moto1.mover());
                }

            }

            if(Objects.equals(qualVeiculo, "caminhao")){

                Veiculo caminhao1 = new Caminhao(modelo, precoDiario, placa);
                veiculos.add(caminhao1);


                if (andarEscolha == 'y' || andarEscolha == 'Y'){
                    System.out.println(caminhao1.mover());
                }

            }


        }


//        veiculos.add(new Carro("Ford",223, "FGHJ-456G"));
//        veiculos.add(new Caminhao("Volkswagen", 600, "ASDS-324L"));
//        veiculos.add(new Moto("kawasaki", 300, "XVCX-5V7K"));


        for(Veiculo veiculo : veiculos){
            System.out.println("==========================================================================");
            System.out.println(veiculo.calcularPreco(12));
        }

        input.close();

    }

}
