package programacaoobjetos.exercicios.exerciciofixacaodolar;


public class CurrencyConverter {
    public static final double IOF = 6;

    public static double convertForDolar(double dolarValue, double convertValue){


        double valuePaid = convertValue * dolarValue;
        double decimalIOF = IOF/100;
        return valuePaid + valuePaid * decimalIOF;
//        double porcentagemCalculo = (6/100) * valuePaid;
//        double valorPago = valuePaid + porcentagemCalculo;
    }
}
