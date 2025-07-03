package heranca_e_polimorfismo.exercicios.exercicioproduto.model;

public class ImportedProduct extends Produto {
    private double customsFree;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    @Override
    public String priceTag(){
        double precoComTaxa = price + 20.0;
        String preco = String.format("%.2f", precoComTaxa);
        return getName() + " - " + "$" + price + "(Customs free:" + customsFree + ")";
    }

    public Double totalPrice(){
        return price + customsFree;
    }


}
