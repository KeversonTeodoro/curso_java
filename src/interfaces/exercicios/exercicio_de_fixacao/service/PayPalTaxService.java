package interfaces.exercicios.exercicio_de_fixacao.service;

import interfaces.exemlpos_video.model.services.TaxService;

public class PayPalTaxService implements TaxService {

    public double tax(double amount){
        return amount + 0.2;
    }

    public double juro(double amount, int month){
        return amount * 0.01 * month;
    }
}