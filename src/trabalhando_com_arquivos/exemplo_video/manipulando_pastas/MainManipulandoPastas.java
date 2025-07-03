package trabalhando_com_arquivos.exemplo_video.manipulando_pastas;
import java.io.File;
import java.util.Scanner;

public class MainManipulandoPastas {
    public static void main(String[] args) {
        // instanciando o caminho
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String pathWay = input.next();

        File path = new File(pathWay);
        File[] folders = path.listFiles(File::isDirectory);// passando uma função que especifica apenas diretorios

        System.out.println("FOLDERS: ");

        assert folders != null;
        System.out.println("FOLDERS: ");
        for(File pasta : folders){
            System.out.println(pasta);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files ){
            System.out.println(file);
        }

        // criação de subpastas com File
        boolean sucsess = new File("/subdir" + pathWay).mkdir();
        System.out.println("Diretório criado com sucesso!! ");

        input.close();

    }
}
