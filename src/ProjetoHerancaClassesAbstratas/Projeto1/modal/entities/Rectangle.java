package ProjetoHerancaPolimorfismo.ProjetoHerancaClassesAbstratas.Projeto1.modal.entities;

public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle() {
    }

    public Rectangle(Color color,Double height,Double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
