package projeto_POO.projeto_02.model.entities;

import projeto_POO.projeto_02.model.services.Shippable;
import projeto_POO.projeto_02.model.services.Taxable;

public class NacionalProduct extends PhysicalProduct implements Shippable {

    public NacionalProduct(String name, Double price, Double weight, Double dimension) {
        super(name, price, weight, dimension);
    }

    @Override
    public double totalValue() {
       return getPrice() + calculateShipping();
    }

    @Override
    public double calculateShipping() {
        return getDimension() * getWeight() * 0.08;
    }
}
