package enumeracoes.exerciciostringbuilder;

import enumeracoes.exerciciostringbuilder.model.Comentario;
import enumeracoes.exerciciostringbuilder.model.Post;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioStringBuilderApplication {
    public static void main(String[] args) {
        Date data = new Date();
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comentario comentary = new Comentario();
        comentary.setComentario("Meu Deus que legal, quero ir");

        String titulo = "Léo Santana no arrocha";
        String content = "Reportagem";

        Post post1 = new Post();
        post1.addComentary(comentary);
        post1.setContent(content);
        post1.setLikes(12000);
        post1.setMomentDate(data);
        post1.setTitle(titulo);

        System.out.println(" Date of post: " + post1.getMomentDate());
        System.out.println(" Comentary: " + post1.getComentarios());
        System.out.println(" Conteudo: " + post1.getContent());
        System.out.println(" Likes: " + post1.getLikes());

        System.out.println(post1);


    }
}
