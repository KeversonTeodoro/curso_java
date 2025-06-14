package Listas.exerciciosLista;
import Listas.exerciciosLista.model.Usuario;
import Listas.exerciciosLista.repositorio.UsuarioRepository;
import Listas.exerciciosLista.service.IncreaseSalary;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

class UsuarioService{
    public IncreaseSalary increaseSalary;
    public UsuarioRepository usuarioRepository;


    public UsuarioService(IncreaseSalary increaseSalary, UsuarioRepository usuarioRepository){
        this.increaseSalary = increaseSalary;
        this.usuarioRepository = usuarioRepository;

    }

    public UsuarioService(){

    }

    public void buscarId(int id){
        increaseSalary.searchId(id);
    }

    public void AumentarSalario(int porcentagem, int id){
        Usuario funcionarioBuscado = increaseSalary.searchId(id);
        if(funcionarioBuscado == null){
            System.out.println("Funcionário inexistente! ");
        }
        else {
            increaseSalary.Aumentar(porcentagem, id);
            System.out.println("Salário alterado com sucesso! ");
        }

    }

    public void addInRepository(Usuario usuario){
        increaseSalary.adicionarNoRepositorio(usuario);
    }
}


public class AplicationExercicioLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        IncreaseSalary increaseSalary = new IncreaseSalary(usuarioRepository);
        UsuarioService usuarioService = new UsuarioService(increaseSalary, usuarioRepository);



        System.out.print("How many employes you want register? ");
        int range = input.nextInt();

        for(int n = 0; n < range; n++){
            System.out.println("Digite o " + (n+1) + "funcionario: ");

            String name = input.next();
            System.out.println("======");
            int id = input.nextInt();
            double wage = input.nextDouble();

            Usuario usuario = new Usuario(name, wage, id);
            usuarioService.addInRepository(usuario);
            System.out.println(usuario.getNome() + usuario.getId() + usuario.getSalario());
            System.out.println(usuarioRepository.getFuncionarios());
            System.out.println();
            System.out.print("Você quer aumentar o salario de " + usuario.getNome() + " y/n ? ");
            char response = input.next().charAt(0);

            if(response == 'y'){
                System.out.println("Qual a porcentagem? ");
                int porcentagem = input.nextInt();

                usuarioService.AumentarSalario(1000, 1);
                System.out.println(usuario.getNome() + usuario.getSalario());

            }


        }

        input.close();




    }
}
