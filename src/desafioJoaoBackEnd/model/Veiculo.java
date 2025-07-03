package desafioJoaoBackEnd.model;


public class Veiculo {
    private String modelo;
    private double preco;
    private String placa;

    public Veiculo(String modelo, double preco, String placa) {
        this.modelo = modelo;
        this.preco = preco;
        this.placa = placa;
    }


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


    public String calcularPreco(int dia){
        double valorAluguel = preco * dia;
        String valorEmString = String.format("%.2f", valorAluguel);
        return valorEmString;
    }


    public String mover(){
        return "";

    }


}
