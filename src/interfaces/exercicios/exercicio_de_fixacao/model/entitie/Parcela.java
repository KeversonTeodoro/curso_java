package interfaces.exercicios.exercicio_de_fixacao.model.entitie;

import interfaces.exercicios.exercicio_de_fixacao.service.PayPalTaxService;
import interfaces.exercicios.exercicio_de_fixacao.service.PaymentService;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Parcela {

    LocalDate dataDaParcela;
    private double valor;

    public Parcela(){

    }

    public Parcela(LocalDate dataDaParcela, double valor) {
        this.dataDaParcela = dataDaParcela;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return dataDaParcela + " - " + String.format("%.2f", valor);
    }




//    public double gerarParcela(Contrato cont){
//        PayPalTaxService payPalTaxService1 = new PayPalTaxService();
//        double totalParcela = cont.getTotalContract() / numero;
//        return payPalTaxService1.tax(totalParcela);
//    }


}
