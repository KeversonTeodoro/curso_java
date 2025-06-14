package Listas.exerciciosLista.repositorio;
import java.util.List;
import java.util.ArrayList;

import Listas.exerciciosLista.model.Usuario;

public class UsuarioRepository {
    private final List<Usuario> funcionariosList = new ArrayList<>();


    public void addFuncionario(Usuario usuario){
        funcionariosList.add(usuario);
    }

    public List<Usuario> getFuncionarios(){
        return funcionariosList;
    }

    public Usuario buscarFuncionario(int id){

        for (Usuario funcionario : funcionariosList){
            int pegaId = (int) funcionario.getId();
            if (pegaId == id){
                return funcionario;
            }

        }
        return null;
    }

    public UsuarioRepository(){

    }

}
