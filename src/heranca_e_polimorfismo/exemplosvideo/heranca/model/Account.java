package heranca_e_polimorfismo.exemplosvideo.heranca.model;

public class Account {
    private int number;
    private String holder;
    protected double balance; // so pode ser acessado por classes do mesmo pacote ou o subclasses derivadas


    public void withdraw(double amount){

        this.balance -= amount + 5.0;
    }

    public Account(){

    }


    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
