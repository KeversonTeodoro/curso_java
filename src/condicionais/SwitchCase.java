package condicionais;
import java.util.Random;

public class SwitchCase {
    public static void main(String[] args) {
        Random random = new Random();
        int valorAleatorio = random.nextInt(1, 7);
        String dia = "";
        switch (valorAleatorio) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Valor inválido";
                break;

        }
        System.out.printf(dia);
    }
}
