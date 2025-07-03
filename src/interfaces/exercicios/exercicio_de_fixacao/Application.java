package interfaces.exercicios.exercicio_de_fixacao;

import interfaces.exercicios.exercicio_de_fixacao.model.entitie.Contrato;
import interfaces.exercicios.exercicio_de_fixacao.model.entitie.Parcela;
import interfaces.exercicios.exercicio_de_fixacao.service.ContractService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//        LocalDateTime data = LocalDateTime.parse(input.nextLine(), form);

//        Contrato contrato = new Contrato(9009, 600,  LocalDateTime.parse("12/08/2007", form);
        Contrato contrato = new Contrato();

        ContractService service = new ContractService(null, null);

        service.processContract(contrato, 3);

        for(Parcela parcela : contrato.getParcelas()){
            System.out.println(parcela.toString());
        }



    }
}
