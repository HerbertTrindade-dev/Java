package projeto_enums.projeto_02.model.services;

public class NoDiscount implements Promotion {
    @Override
    public double applyDiscount(double price) {
        return price;
    }
}
