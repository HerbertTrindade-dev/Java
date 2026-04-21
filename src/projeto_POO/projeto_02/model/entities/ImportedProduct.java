package projeto_POO.projeto_02.model.entities;

import projeto_POO.projeto_02.model.services.Shippable;
import projeto_POO.projeto_02.model.services.Taxable;

public class ImportedProduct extends PhysicalProduct implements Taxable, Shippable {

    public ImportedProduct(String name, Double price, Double weight, Double dimension) {
        super(name, price, weight, dimension);
    }

    @Override
    public double totalValue() {
        return getPrice() + calculateShipping() + calculationTax();
    }

    @Override
    public double calculationTax() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateShipping() {
        return getDimension() * getWeight() * 0.05;
    }
}

