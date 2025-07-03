package interfaces.exemlpos_video.model.services;

import interfaces.exemlpos_video.model.entitie.CarRental;
import interfaces.exemlpos_video.model.entitie.Invoice;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;

    private TaxService taxServices;

    public RentalService(){

    }

    public RentalService(double pricePerHour, TaxService taxServices, double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.taxServices = taxServices;
        this.pricePerDay = pricePerDay;
    }

    public void  processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStartDate(), carRental.getFinishDate()).toMinutes();
        double hours = minutes / 60;
        double basicPayment;
        if(hours <= 12.0){
            basicPayment = pricePerHour* Math.ceil(hours);
        }
        else{
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }
        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));


    }

}
