package projeto_POO.projeto_02.model.entities;

import projeto_POO.projeto_02.model.services.Promotion;

public class OrderItem  {

    private Integer quantity;
    private Product product;
    private Promotion promotion;

    public OrderItem(){
    }

    public OrderItem(Integer quantity){
        this.quantity = quantity;
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;

    }

    public Promotion getPromotion() {
        return promotion;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public Double subTotal(){
        return quantity * product.getPrice();
    }


}
