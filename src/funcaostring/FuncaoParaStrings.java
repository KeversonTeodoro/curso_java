package funcaostring;

public class FuncaoParaStrings {
    public static void main(String[] args) {
        String frase = "Testando os comando para manipular Strings        ";

        System.out.println("Frase para maiusculo: " + frase.toUpperCase() + "-");
        System.out.println("Frase para minusculo: " + frase.toLowerCase() + "-");
        System.out.println("Frase sem os espaços: " + frase.trim() + "-"); // remove os espaços nos cantos da String
        System.out.println("Frase recorte de caracter: " + frase.substring(1, 9));
        System.out.println("Frase usando replace: " + frase.replace('a', 'x'));
        System.out.println("Frase usando replaceAll: " + frase.replaceAll("comando", "esse texto")); // substitui uma palavra inteira especifica
        System.out.println("Frase usando o indexOff: " + frase.indexOf("comando")); //ve em qual posição ele está

        System.out.println("===================================================");
        System.out.println();

        //Objetivo: separar as palavras uma a uma e colocar em um vetor
        String palavras = "Potato Apple Lemon";

        String[] vetor = palavras.split(" ");
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);

        for(String palavra : vetor){
            System.out.println(palavra);
        }




    }
}
