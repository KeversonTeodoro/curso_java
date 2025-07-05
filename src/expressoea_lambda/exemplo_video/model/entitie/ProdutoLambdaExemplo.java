package expressoea_lambda.exemplo_video.model.entitie;

public class ProdutoLambdaExemplo {
    private String name;
    private double preco;

    public ProdutoLambdaExemplo(String name, double preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString(){
        return name + " " + preco;
    }
}
