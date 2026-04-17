package projeto_enums.projeto_02.model.services;

public class BlackFridayDiscount implements Promotion {
    @Override
    public double applyDiscount(double price) {
        return price * (0.50);
    }
}
