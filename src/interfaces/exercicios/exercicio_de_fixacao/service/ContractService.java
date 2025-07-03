package interfaces.exercicios.exercicio_de_fixacao.service;

import interfaces.exercicios.exercicio_de_fixacao.model.entitie.Contrato;
import interfaces.exercicios.exercicio_de_fixacao.model.entitie.Parcela;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContractService {

    private final PaymentService paymentService;
    private final PayPalTaxService payPalTaxService;





    public ContractService(PaymentService paymentService, PayPalTaxService payPalTaxService) {
        this.paymentService = paymentService;
        this.payPalTaxService = payPalTaxService;
    }

    public void processContract(Contrato contract, int months){

        double basicQuota = contract.getTotalContract() / months;


        for (int i = 0; i < months; i++) {

            LocalDate data = contract.getDateContract().plusMonths(i);
            double interest = payPalTaxService.juro(contract.getTotalContract(), months);
            double fee = paymentService.tax(basicQuota + interest)  ;
            double quota = basicQuota + interest + fee;
            contract.getParcelas().add(new Parcela(data, quota));
        }
        contract.getParcelas().add(new Parcela(LocalDate.of(2012, 12, 2), 206.04));
        contract.getParcelas().add(new Parcela(LocalDate.of(2012, 11, 5), 206.04));
    }
}
