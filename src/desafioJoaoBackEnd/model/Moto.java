package desafioJoaoBackEnd.model;
import java.util.Random;

public class Moto extends Veiculo{


    public Moto(String modelo, double preco, String placa) {
        super(modelo, preco, placa);
    }

    @Override
    public String calcularPreco(int dia){

        double precoDiario = getPreco() * dia;
        double porcentagem = 0.05 * precoDiario;
        double valorTotal = precoDiario - porcentagem;

        String valorEmString = String.format("%.2f", valorTotal);

        return "Moto - " + getModelo() + " teve um desconto de 5% " + "R$" + valorEmString + " (valor sem desconto: "
                + "R$"
                + precoDiario
                + ")";

    }

    @Override
    public String mover(){
        Random random = new Random();
        int quilometragem = random.nextInt(1, 300);

        return "RANDANRADANRANDAN" + "A moto "
                + getModelo()
                +" moveu para o eixo x a "
                + quilometragem
                + "km por hora";
    }




}
////    private String modelo;
////    private double preco;
////    private String placa;
//    private final Veiculo veiculo;
//
//    public Moto(Veiculo veiculo){
//        this.veiculo = veiculo;
//    }
//
//    public double getPreco(){
//        return veiculo.getPreco();
//    }
//    public String getModelo(){
//        return veiculo.getModelo();
//    }
//    public String getPlaca(){
//        return veiculo.getPlaca();
//    }
//
//    public void setPreco(double preco){
//        veiculo.setPreco(preco);
//    }
//
//}
