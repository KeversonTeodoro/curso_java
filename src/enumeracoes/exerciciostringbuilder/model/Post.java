package enumeracoes.exerciciostringbuilder.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date momentDate;
    private String title;
    private String content;
    private int likes;

    List<Comentario> comentarios = new ArrayList<>();

    public Post(){

    }

    public Date getMomentDate() {
        return momentDate;
    }

    public void setMomentDate(Date momentDate) {
        this.momentDate = momentDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addComentary(Comentario comentario){
        comentarios.add(comentario);
    }

//    @Override
//    public String toString(){
//        return momentDate + " " + title + " " + content + " " + likes + " " + comentarios;
//    }

    public List<Comentario> mostrarComentario(){
        return comentarios;
    }

    SimpleDateFormat form = new SimpleDateFormat();

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - ");
        stringBuilder.append(form.format(momentDate));
        stringBuilder.append(content + "\n");
        stringBuilder.append("comments: \n ");
        for(Comentario comentario : comentarios){
            stringBuilder.append(comentario.getComentario() + "\n");
        }
        return stringBuilder.toString();
    }


}
