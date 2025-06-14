package desafioJoaoBackEnd.model;
//
public class Carro extends Veiculo {

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
    public double CalcularPreco(int dia) {

        double precoDiario = getPreco() * dia;
        double porcentagem = (10/100) * precoDiario;
        double valorTotal = precoDiario + porcentagem;
        this.setPreco(valorTotal);
        return getPreco();

    }
}
