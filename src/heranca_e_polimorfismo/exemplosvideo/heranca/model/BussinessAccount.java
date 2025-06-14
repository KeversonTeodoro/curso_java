package heranca_e_polimorfismo.exemplosvideo.heranca.model;

public class BussinessAccount extends Account{
    private double loanLimit;

    public BussinessAccount(){
        super();
    }

    public BussinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }

    }

    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
