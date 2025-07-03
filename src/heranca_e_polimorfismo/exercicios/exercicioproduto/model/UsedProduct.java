package heranca_e_polimorfismo.exercicios.exercicioproduto.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends Produto{
    private LocalDate manufactureDate;

    public UsedProduct(){

    }

    public UsedProduct(String name, double price, LocalDate manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() throws ParseException {

        String preco = String.format("%.2f", price);
        return getName() + " -" + " (Used) " + "$" + preco + " (Manufacture date: " + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
