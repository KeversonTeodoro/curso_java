package saida_de_dados;

import java.util.Locale;

public class SaidaDeNumeros {
    public static void main(String[] args) {

        // metodo para printar os valores formatados em 2 casas decimais
        double valor = 12.3326;

        System.out.printf("%.2f%n", valor); // porcento n é a quebra de linha
        Locale.setDefault(Locale.US);

        String nome = "Maria";
        int idade = 19;
        double renda = 1518.00;
        System.out.printf("%s tem %d anos e ganha RS %.2f reais%n", nome, idade, renda);



    }
}
