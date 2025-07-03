package desafioJoaoBackEnd.model;

import java.util.Random;

//
public class Carro extends Veiculo {



    public Carro(String modelo, double preco, String placa) {
        super(modelo, preco, placa);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    @Override
    public String getPlaca() {
        return super.getPlaca();
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setPlaca(String placa) {
        super.setPlaca(placa);
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }


    @Override
    public String calcularPreco(int dia) {

        double precoDiario = getPreco() * dia;
        double porcentagem = 0.1 * precoDiario;
        double valorTotal = precoDiario + porcentagem;

        String valorNormal = String.format("%.2f", precoDiario);
        String valorEmString = String.format("%.2f", valorTotal);

        return "Carro " + " - " + getModelo()
                + " teve um acrescimo de 10%: "
                +"R$"
                + valorEmString
                + " (Valor sem acréscimo: "
                + "RS"
                + valorNormal
                + ")";

    }

    public String mover(){
        Random random = new Random();
        int quilometragem = random.nextInt(1, 300);

        return "VRUUUUMMMMMMMM" + "O carro "
                + getModelo()
                +" moveu para o eixo y a "
                + quilometragem
                + "km por hora";
    }
}
