package projeto_POO.projeto_02.model.services;

public interface DeliveryService {
     default double CalculationDelivery(double weight, double dimension){
         return weight * dimension * 0.20;
     };
}
