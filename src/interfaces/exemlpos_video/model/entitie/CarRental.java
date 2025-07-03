package interfaces.exemlpos_video.model.entitie;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CarRental {
    private LocalDateTime startDate;
    private LocalDateTime finishDate;

    private final Vehicle vehicle;
    private Invoice invoice;


    public CarRental(Vehicle vehicle, Invoice invoice){
        this.vehicle = vehicle;
        this.invoice = invoice;

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public CarRental(LocalDateTime startDate, LocalDateTime finishDate, Vehicle vehicle) {
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.vehicle = vehicle;


    }

    public CarRental(String carModel, Vehicle vehicle) {
        this.vehicle = vehicle;

    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDateTime finishDate) {
        this.finishDate = finishDate;
    }
}
