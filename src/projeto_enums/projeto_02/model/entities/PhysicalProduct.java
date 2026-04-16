package projeto_enums.projeto_02.model.entities;

public class PhysicalProduct extends Product {

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
    public double totalValue() {
        return 0;
    }
}
