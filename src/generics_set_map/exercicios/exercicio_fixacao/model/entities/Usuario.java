package generics_set_map.exercicios.exercicio_fixacao.model.entities;

import java.util.Objects;

public class Usuario {
    private String name;
    private int voto;

    public Usuario(String name, int voto) {
        this.name = name;
        this.voto = voto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return voto == usuario.voto && Objects.equals(name, usuario.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, voto);
    }
}
