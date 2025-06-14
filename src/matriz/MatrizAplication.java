package matriz;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MatrizAplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rangeMatriz = input.nextInt();

        int [][] matriz = new int[rangeMatriz][rangeMatriz];

        // para fazer a matriz é necessário percorrer usando dois "for"
        int numerosNegativos = 0;
        for(int linha = 0; linha < rangeMatriz; linha++){
            for(int coluna = 0 ; coluna < rangeMatriz; coluna++){
                matriz[linha][coluna] = input.nextInt();
                if(matriz[linha][coluna] < 0){
                    numerosNegativos += 1;
                }
            }
        }

        List<Number> numerosDiagonal = new ArrayList<>();
        for(int n =0; n < rangeMatriz ; n ++){
            System.out.println(matriz[n][n] + " ");
            numerosDiagonal.add(matriz[n][n]);
        }

        System.out.println("Diagonal: " + numerosDiagonal);
        System.out.println("Quantidade de numeros negativos " + numerosNegativos);



        input.close();



    }
}
