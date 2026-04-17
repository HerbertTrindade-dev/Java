package projeto_enums.projeto_02.model.entities;

public class DiscountedProduct extends Product{

    private final static double DISCCOUNT = 0.20;

    public DiscountedProduct(String name, Double price) {
        super(name, price);
    }

    @Override
    public double totalValue() {
        return 0;
    }
}
