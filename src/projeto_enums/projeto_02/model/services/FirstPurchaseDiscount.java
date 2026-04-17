package projeto_enums.projeto_02.model.services;

public class FirstPurchaseDiscount implements Promotion {
    @Override
    public double applyDiscount(double price) {
        return price * 0.90;
    }
}
