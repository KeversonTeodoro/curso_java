package desafioJoaoBackEnd.model;
import java.util.Random;

public class Caminhao extends Veiculo{



    public Caminhao(String modelo, double preco, String placa){
        super(modelo, preco, placa);

    }



    @Override
    public String calcularPreco(int dia) {

        double precoDiario = getPreco() * dia;
        double porcentagem = 0.2 * precoDiario;
        double valorTotal = precoDiario + porcentagem;

        String valorNormal = String.format("%.2f",precoDiario);
        String valorEmString = String.format("%.2f", valorTotal);

        return "Caminhão" + " - " + getModelo() + " Teve um acréscimo de 20%: " + "R$" + valorEmString + " (Valor sem acrescimo " + "R$" + valorNormal + ")";

    }

    @Override
    public String mover(){
        Random random = new Random();
        int quilometragem = random.nextInt(1, 300);

        return "PAAAAAAAAAAAAAAAAAAAA" + "O caminhão"
                + getModelo()
                +" moveu para o eixo x a "
                + quilometragem
                + "km por hora";
    }




}
