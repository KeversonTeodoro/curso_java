package heranca_e_polimorfismo.exemplosvideo.heranca.model;

public class SavingsAccount extends Account{
    private double intersRate;

    public SavingsAccount (){
        super();
    }

    public SavingsAccount(int number, String holder, double balance, double intersRate){
        super(number, holder, balance);
        this.intersRate = intersRate;
    }

    public double getIntersRate(){
        return intersRate;
    }

    public void setIntersRate(double intersRate){
        this.intersRate = intersRate;
    }

    public void updateBalance(){
        balance += balance * intersRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

}
