package condicionais;
import java.util.Random;

public class ControlarMinutosConsumindos {
    public static void main(String[] args) {
        Random random = new Random();

        int minutos = random.nextInt(1, 150);
        double valorplano = 50.00;
        if(minutos > 100){
            valorplano += (minutos - 100) * 2.00;
            System.out.printf("Ops, você utrapassou o limite de minutos o valor a ser pago sera de R$ %.2f e o seus minutos ficaram %n ", valorplano, minutos);
        }
        else {
            if(valorplano <= 100){
                System.out.println("Sua conta esta no valor de " + valorplano);
            }
        }
    }
}
