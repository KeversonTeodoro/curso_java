package desafioJoaoBackEnd;

import desafioJoaoBackEnd.model.Carro;
import desafioJoaoBackEnd.model.Veiculo;

public class CarroApplication {
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        carro.setPreco(12.000);

        carro.CalcularPreco(23);
        System.out.println(carro.getPreco());

    }

}
