package heranca_e_polimorfismo.exerciciofixacao.model;

public class PessoaJuridica extends Pessoa {
    private int numberEmployee;

    public PessoaJuridica(String nome, double income, int numberEmployee){
        super(nome, income);
        this.numberEmployee = numberEmployee;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    public void setNumberEmployee(int numberEmployee) {
        this.numberEmployee = numberEmployee;
    }

    @Override
    public double calcularImposto(){

        double income = getIncome();
        int employeeNumber = getNumberEmployee();
        double valorQueVaiSerRetirado = 0;
        double incomee = getIncome();
        double taxa = 0;


        if(employeeNumber > 10){
            valorQueVaiSerRetirado = incomee * 0.14;
            taxa = valorQueVaiSerRetirado;

        }

        else{
            valorQueVaiSerRetirado = incomee * 0.16;
            taxa = valorQueVaiSerRetirado;

        }

        return taxa;

    }
}
