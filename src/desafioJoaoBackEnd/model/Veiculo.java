package desafioJoaoBackEnd.model;


public class Veiculo {
    private String modelo;
    private double preco;
    private String placa;

//    public Veiculo(Carro carro){
//        this.carro = carro;
//    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public double getPreco(){
        return preco;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public double CalcularPreco(int dia){
        return this.preco *= dia;
    }


    public void mover(){

    }


}
