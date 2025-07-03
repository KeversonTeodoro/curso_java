package interfaces.interface_comparable;

import interfaces.interface_comparable.model.entitie.Employee;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Collection.*;


public class main {
    public static void main(String[] args) {
        List<Employee> listaDeFuncionairios = new ArrayList<>();

        String path = "/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/interfaces/interface_comparable/funcionarios.txt";

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            String employeeCsv = bf.readLine();
            while(employeeCsv != null ){
                String[] pessoaSplit = employeeCsv.split(",");
                listaDeFuncionairios.add(new Employee(pessoaSplit[0], Double.parseDouble(pessoaSplit[1])));
                employeeCsv = bf.readLine();

            }
            for(Employee employee : listaDeFuncionairios){
                System.out.println(employee.getName() + " " + employee.getSalary());
            }

        }
        catch (IIOException e ){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
