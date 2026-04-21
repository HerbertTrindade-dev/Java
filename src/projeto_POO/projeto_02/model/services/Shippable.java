package projeto_POO.projeto_02.model.services;

public interface Shippable {
     double calculateShipping();
     default String shippingInfo(){
          return "Frete: R$"+String.format("%.2f",calculateShipping());
     }
}
