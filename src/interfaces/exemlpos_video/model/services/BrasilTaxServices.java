package interfaces.exemlpos_video.model.services;

public class BrasilTaxServices implements TaxService {
    public double tax(double amout){
        if(amout > 100.00){
            return 0.15*amout;
        }
        return 0.2 * amout;

    }
}
