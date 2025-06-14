package matriz.exerciciomatriz;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class exercicioPropostoMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroDeLinhas = input.nextInt();
        int numeroDecolunas = input.nextInt();

        int[][] matriz = new int[numeroDeLinhas][numeroDecolunas];

        for(int linha = 0; linha < numeroDeLinhas; linha++){
            for(int coluna = 0; coluna < numeroDecolunas; coluna++){
                matriz[linha][coluna] = input.nextInt();
            }
        }
        System.out.print("Digite um numero para ser encontrado na matriz: ");
        int numeroParaEncontrar = input.nextInt();
        List<Number> posicaoDosNumeros = new ArrayList<>();

        for(int linha = 0; linha < numeroDeLinhas; linha++){
            for(int coluna = 0; coluna < numeroDecolunas; coluna ++){
                if(matriz[linha][coluna] == numeroParaEncontrar){
                    posicaoDosNumeros.add(linha);
                    System.out.print(" Position: ");
                    System.out.print(linha);
                    System.out.print("," + coluna);

                    System.out.print(" Left: ");
                    System.out.print(matriz[linha][coluna -1]);
                    System.out.print(" Up: " + matriz[linha -1][coluna]);
                    System.out.print(" Right: " + matriz[linha][coluna +1]);
                    System.out.print(" Down: " + matriz[linha + 1][coluna]);
                    posicaoDosNumeros.add(coluna);
                }
            }
        }


    }
}
