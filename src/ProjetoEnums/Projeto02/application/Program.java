package ProjetoEnums.Projeto02.application;

import ProjetoEnums.Projeto02.model.entities.Client;
import ProjetoEnums.Projeto02.model.entities.Order;
import ProjetoEnums.Projeto02.model.entities.OrderItem;
import ProjetoEnums.Projeto02.model.entities.Product;
import ProjetoEnums.Projeto02.model.entities.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Digite o seu email: ");
        String email = sc.nextLine();
        System.out.print("Digite a data do seu aniversario (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Digite os dados dos pedidos:");
        System.out.print("Digite o numero do Status do produto: [0-PAGAMENTO_PENDENTE/1-PROCESSANDO/2-ENVIADO/3-ENTREGUE]");
        int statusIndex = sc.nextInt();
        Order order = new Order(LocalDateTime.now(), OrderStatus.values()[statusIndex], new Client(name, email, birthDate));

        System.out.print("Digite a quantidade de items no pedido :");
        int qtdItems = sc.nextInt();

        for (int i = 0; i < qtdItems; i++) {
            System.out.println("Digite o #"+(i+1)+" pedido:");
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();
            System.out.print("Preco do produto: R$");
            double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            OrderItem orderItems = new OrderItem(quantity,new Product(productName,productPrice));

            order.addItem(orderItems);
        }

        System.out.println("\nRESUMO DO PEDIDO:");
        System.out.println(order);

        sc.close();
    }
}
