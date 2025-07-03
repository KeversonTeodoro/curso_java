package interfaces.exemlpos_video;
import interfaces.exemlpos_video.model.entitie.CarRental;
import interfaces.exemlpos_video.model.entitie.Vehicle;
import interfaces.exemlpos_video.model.services.BrasilTaxServices;
import interfaces.exemlpos_video.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class SolucaoDoProblema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Qual o modelo do carro: ");
        String carModel = input.nextLine();
        System.out.print("Retirada: ");
        LocalDateTime start = LocalDateTime.parse(input.nextLine(), form);
        System.out.print("Retorno: ");
        LocalDateTime finish = LocalDateTime.parse(input.nextLine(), form);

        Vehicle veiculo = new Vehicle(carModel);

        CarRental aluguel = new CarRental(start, finish, (veiculo));

        System.out.print("Enter price per hour: ");
        double priceHour = input.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = input.nextDouble();

        RentalService rentalService = new RentalService(priceHour, new BrasilTaxServices(), pricePerDay);
        rentalService.processInvoice(aluguel);

        System.out.println("fatura: ");
        System.out.println("Pagamento básico: " + aluguel.getInvoice().getBasicPayment());
        System.out.println("imposto: " + aluguel.getInvoice().getTax());
        System.out.println("Pagamento total: ");





    }
}
