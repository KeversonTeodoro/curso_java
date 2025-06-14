package Listas.exerciciosLista.service;

import Listas.exerciciosLista.model.Usuario;
import Listas.exerciciosLista.repositorio.UsuarioRepository;
import java.util.ArrayList;
import java.util.List;

public class IncreaseSalary {
    public Usuario usuario;
    private final UsuarioRepository usuarioRepository;


    public IncreaseSalary(Usuario usuario, UsuarioRepository usuarioRepository){
        this.usuario = usuario;
        this.usuarioRepository = usuarioRepository;
    }


    public IncreaseSalary(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }



    public Usuario searchId(int id){
        return usuarioRepository.buscarFuncionario(id);
    }



    public void Aumentar(int portcentagemAumento, int id){
        Usuario funcionariosExiste = searchId(id);
        if(funcionariosExiste == null){
            System.out.println("Não encontramos esse funcionario na base de dados.");
        }
        else{
            double salarioAtual = usuario.getSalario();
            double aumento = salarioAtual * (portcentagemAumento / 100.0);
            usuario.setSalario(salarioAtual + aumento);
        }

    }
    public void adicionarNoRepositorio(Usuario usuario){
        usuarioRepository.addFuncionario(usuario);
    }

    public List<Usuario> getFuncionarios(){
        return usuarioRepository.getFuncionarios();

    }
}
