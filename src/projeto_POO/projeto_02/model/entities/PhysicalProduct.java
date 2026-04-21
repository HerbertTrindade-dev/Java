package projeto_POO.projeto_02.model.entities;

import projeto_POO.projeto_02.model.services.Shippable;
import projeto_POO.projeto_02.model.services.Taxable;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class PhysicalProduct extends Product {

    private Double weight;
    private Double dimension;

    public PhysicalProduct(String name, Double price, Double weight, Double dimension) {
        super(name, price);
        this.weight = weight;
        this.dimension = dimension;
    }



    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getDimension() {
        return dimension;
    }

    public void setDimension(Double dimension) {
        this.dimension = dimension;
    }

    @Override
    public abstract double totalValue();
}
