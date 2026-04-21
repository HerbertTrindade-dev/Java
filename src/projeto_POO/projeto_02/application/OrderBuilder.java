package projeto_POO.projeto_02.application;

import projeto_POO.projeto_02.model.entities.*;
import projeto_POO.projeto_02.model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderBuilder {

    private final Scanner sc;
    private final DateTimeFormatter fmt;

    public OrderBuilder(Scanner sc, DateTimeFormatter fmt){
        this.sc = sc;
        this.fmt = fmt;
    }

    public Client readClient(){
        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);
        return new Client(name,email,birthDate);
    }

    public Order readOrder(Client client){
        System.out.println("Digite os dados dos pedidos:");
        System.out.print("Digite o numero do Status do produto: [0-PAGAMENTO_PENDENTE/1-PROCESSANDO/2-ENVIADO/3-ENTREGUE]");
        int statusIndex = sc.nextInt();
        sc.nextLine();
        return new Order(LocalDateTime.now(), OrderStatus.searchId(statusIndex), client);
    }

    public void readItem(Order order){
        System.out.print("Digite a quantidade de items no pedido :");
        int qtdItems = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdItems; i++) {
            System.out.println("Digite o #" + (i + 1) + " pedido:");
            System.out.print("Escolha o tipo do produto: [1-Produto digital/2-Produto físico]");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Preco do produto: R$");
            double price = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            try {
                Product pdt = creatProduct(choice,name,price);
                order.addItem(new OrderItem(quantity,pdt));
            } catch (IllegalArgumentException e){
                System.out.println("Erro: "+ e.getMessage() + ". Item ignorado.");
            }
        }
    }

    private Product creatProduct(int choice, String name, double price){
        return switch (choice){
            case 1 -> createDigitalProduct(name, price);
            case 2 -> createPhysicalProduct(name, price);
            default -> throw new IllegalArgumentException("Tipo incorreto: "+ choice);
        };
    }

    private Product createDigitalProduct(String name,double price){
        System.out.print("Link do produto: ");
        String link = sc.nextLine();
        System.out.print("Data de expiracao (dd/MM/yyyy):");
        LocalDate dateExpiration = LocalDate.parse(sc.nextLine(),fmt);
        return new DigitalProduct(name,price,link,dateExpiration);
    }

    private Product createPhysicalProduct(String name, double price){
        System.out.print("Peso g:");
        double weight = sc.nextDouble();
        System.out.print("Comprimento m:");
        double dimension = sc.nextDouble();
        return new PhysicalProduct(name,price,weight,dimension);
    }
}
