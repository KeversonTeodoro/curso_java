package heranca_e_polimorfismo.exemplosvideo.heranca;

import heranca_e_polimorfismo.exemplosvideo.heranca.model.Account;
import heranca_e_polimorfismo.exemplosvideo.heranca.model.BussinessAccount;
import heranca_e_polimorfismo.exemplosvideo.heranca.model.SavingsAccount;

public class ExemploBancoApplication{
    public static void main(String[] args) {

        Account account = new Account(1000, "Pedro", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account contaPoupanca = new SavingsAccount(2009, "Maira", 1000.0, 0.01);
        contaPoupanca.withdraw(200);
        System.out.println(contaPoupanca.getBalance());

        Account contaEmpresa = new BussinessAccount(3009, "Junior", 1000.0, 600);
        contaEmpresa.withdraw(200);
        System.out.println(contaEmpresa.getBalance());




//        Account conta = new Account(1001, "alex", 0.0);
//        BussinessAccount contaEmpresarial = new BussinessAccount(1002, "Maria", 0.0, 500.00);
//        Account conta4 = new BussinessAccount(1005, "Bob", 400.00, 100);
//        Account conta3 = new SavingsAccount(1004, "Anna", 0.0, 200.00);
//
//        // fazendo upcast
//        Account conta2 = contaEmpresarial;

        // downcasting só pode ser feito em objetos ramificados que foram feitos a partir da suber classe

//        conta.setBalance(1000);
//
//        BussinessAccount contaEmp2 = (BussinessAccount) conta4;
//        System.out.println(contaEmp2.getBalance());
//        contaEmp2.loan(100);
//        System.out.println(contaEmp2.getBalance());
//
//        if(conta3 instanceof BussinessAccount){
//            BussinessAccount contaSeila = (BussinessAccount) conta3;
//            contaSeila.loan(200.0);
//            System.out.println("loan");
//        }
//
//        if(conta3 instanceof SavingsAccount){
//            SavingsAccount contaSeila = (SavingsAccount) conta3;
//            contaSeila.updateBalance();
//            System.out.println("Update");
//            System.out.println(contaSeila.getBalance());
//        }





    }
}
