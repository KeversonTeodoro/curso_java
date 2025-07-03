package trabalhando_com_arquivos.exercicios;
import trabalhando_com_arquivos.exemplo_video.filewriter_exemplo.MainFileWriter;
import trabalhando_com_arquivos.exercicios.model.entitie.Produto;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
//        List<Produto> listaDeProdutos = new ArrayList<>();

        System.out.print("Enter file path: ");
        String path = input.nextLine();

//        File file = new File("/home/youx/nfeinfo.txt");
//        boolean foi = file.createNewFile();
//        file.mkdir();
//
//        System.out.println("foi"+foi);


//        criarPasta(path);

        System.out.print("Quantos produtos você quer definir: ");
        int range = input.nextInt();

        Produto[] produtos = new Produto[range];
        System.out.println("Enter product data: ");
        for(int i = 0; i < range; i++ ){

            System.out.print("name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("price: ");
            double price = input.nextDouble();

            System.out.print("quantity: ");
            int quantity = input.nextInt();

            produtos[i] = new Produto(name, price, quantity);

        }



        String outPath = "/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/trabalhando_com_arquivos/out/summary.csv";

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(outPath))){
            for(Produto produto : produtos){

                String nome = produto.getName();
                double price = produto.getPrice();
                int quantidade = produto.getQuatity();
                double total = produto.total();

                escritor.write("nome: " + nome + "price: " + price + "quatidade: "+ quantidade + "total: " + total);
                escritor.newLine();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }







    }

    public static String criarPasta(String path){

        File fileComArquivo = new File(path);
        String caminhaFolder = fileComArquivo.getParent();

        boolean successs = new File(caminhaFolder + "/out").mkdir();
        System.out.println("Pasta criada com sucesso!!");
        return path;
    }
}
