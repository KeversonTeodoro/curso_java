package tratamento_de_excecoes.exemplosvideo.problema_hotel.model.exception;

public class DomainException extends Exception{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
