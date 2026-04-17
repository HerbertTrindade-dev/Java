package projeto_enums.projeto_02.model.entities;

public class EletronicProduct extends PhysicalProduct {

    public EletronicProduct(String name, Double price, Double weight, Double dimension) {
        super(name, price, weight, dimension);
    }

    @Override
    public double totalValue() {
        return super.totalValue();
    }
}
