package projeto_POO.projeto_02.model.entities;

import projeto_POO.projeto_02.model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(){
    }

    public Order(LocalDateTime moment,OrderStatus status,Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment(){
        return moment;
    }

    public void setMoment(LocalDateTime moment){
        this.moment = moment;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double totalValue = 0.0;
        for (OrderItem  item : items){
            totalValue += item.subTotal();
        }
        return totalValue;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(fmt.format(getMoment())+"\n");
        sb.append("Status do pedido:");
        sb.append(status.getOrderName()+"-Id:");
        sb.append(status.getProcessNumber()+"-inf:");
        sb.append(status.orderStatusPrint());
        sb.append("\n"+"Cliente: ");
        sb.append(client.getName()+" ");
        sb.append("("+client.getBirthDate()+") - ");
        sb.append(client.getEmail());
        sb.append("\nItems do pedido:");
        for (OrderItem item : items){
            sb.append("\nProduto: ");
            sb.append(item.getProduct().getName());
            sb.append(", Preco: R$");
            sb.append(item.getProduct().getPrice());
            sb.append(", Quantidade: ");
            sb.append(item.getQuantity());
            sb.append(", Subtotal: R$");
            sb.append(item.subTotal());
        }
        sb.append("\nTotal price: R$");
        sb.append(total());
        return sb.toString();
    }
}
