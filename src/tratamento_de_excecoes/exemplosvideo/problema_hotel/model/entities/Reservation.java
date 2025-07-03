package tratamento_de_excecoes.exemplosvideo.problema_hotel.model.entities;

import tratamento_de_excecoes.exemplosvideo.problema_hotel.model.exception.DomainException;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Reservation {
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    private static final SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");
    // colocando metodo como estatico para que não seja instanciado um novo simpledate para cada objto reservation



    public Reservation(){

    }

    public Reservation(int roomNumber, Date checkin, Date checkout) throws DomainException {
        if(checkin.after(checkout)){
            throw new DomainException("Erro na data de checkout");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public long duration(){
        long diference = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diference, TimeUnit.MILLISECONDS); // converte o valor que esta em milisegundos para dias

    }


    public void updateDates() throws ParseException, DomainException {
        Scanner input = new Scanner(System.in);


        Date dataDUltimoCheckout = getCheckout();
        Date dataAtual = new Date();
        System.out.println("Enter new date of checking and checkout");

        System.out.print("Check-in: ");
        Date checkInNovo = form.parse(input.next());

        System.out.print("Check-out");
        Date checkOutNovo = form.parse(input.next());

        if(checkInNovo.before(dataAtual) || checkOutNovo.before(dataAtual)){
            throw new DomainException("Erro nas datas, informe um valor futuro. ");
        }

        if(checkOutNovo.after(checkInNovo)){
            setCheckin(checkInNovo);
            setCheckout(checkOutNovo);
        }
        else{
            System.out.println("Erro, checkout esta antes do checkin");
        }


    }

    @Override
    public String toString(){
        return "Room " + getRoomNumber() + ", "
                + "Check-in "
                + form.format(checkin)
                + ", "
                +"Check-out "
                + form.format(checkout)
                + ", "
                + duration()
                + " nights";
    }
}
