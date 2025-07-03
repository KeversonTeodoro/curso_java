package heranca_e_polimorfismo.exerciciofixacao.model;

public class PessoaFisica extends Pessoa {
    private double gastoComSaude;

    public PessoaFisica(){

    }

    public PessoaFisica(String name, double income) {
        super(name, income);
    }

    public double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    public PessoaFisica(String name, double income, double gastoComSaude){
        super(name, income);
        this.gastoComSaude = gastoComSaude;

    }



    public double calcularImposto(){
        double valorComImposto = 0;
        double income = getIncome();
        double taxa = 0;
        double gastoComSaude = getGastoComSaude();

        double valorQueVaiSerRetirado = 0.0;

        if(income < 20000 && getGastoComSaude() > 0){
            double porcentagemTaxa = income * 0.15;
            double porcentagemGastoSaude = gastoComSaude * 0.5;

            valorQueVaiSerRetirado = porcentagemTaxa - porcentagemGastoSaude;
            taxa = valorQueVaiSerRetirado;

        }

        else if(income >= 20000.00 && gastoComSaude > 0){
            valorQueVaiSerRetirado = (income * 0.25) - (gastoComSaude * 0.5) ;
            taxa = valorQueVaiSerRetirado;

        }

        else if(income > 20000.00){
            valorQueVaiSerRetirado = (income * 0.15);
            taxa = valorQueVaiSerRetirado;
        }

        else if (income >= 20000.00){
            valorQueVaiSerRetirado = (income * 0.25);
            taxa = valorQueVaiSerRetirado;
        }


        return taxa;


    }
}
