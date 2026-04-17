package projeto_POO.projeto_02.application;

import projeto_POO.projeto_02.model.entities.*;
import projeto_POO.projeto_02.model.enums.OrderStatus;

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
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Digite os dados dos pedidos:");
        System.out.print("Digite o numero do Status do produto: [0-PAGAMENTO_PENDENTE/1-PROCESSANDO/2-ENVIADO/3-ENTREGUE]");
        int statusIndex = sc.nextInt();
        Order order = new Order(LocalDateTime.now(), OrderStatus.searchId(statusIndex), new Client(name, email, birthDate));

        System.out.print("Digite a quantidade de items no pedido :");
        int qtdItems = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < qtdItems; i++) {
            System.out.println("Digite o #" + (i + 1) + " pedido:");
            System.out.print("Escolha o tipo do produto: [1-Produto Digital/2-Produto Físico]");
            int choiceTypeProduct = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();
            System.out.print("Preco do produto: R$");
            double productPrice = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product pdt = null;
            if (choiceTypeProduct == 1) {
                System.out.print("Digite o link do produto:");
                String link = sc.nextLine();
                System.out.print("Digite a data de expiração: (dd/MM/yyyy)");
                LocalDate dateExpiration = LocalDate.parse(sc.nextLine(),fmt);
                pdt = new DigitalProduct(productName,productPrice,link,dateExpiration);
            } else if (choiceTypeProduct == 2) {
                System.out.print("Digite o peso: Kg");
                double weight = sc.nextDouble();
                System.out.print("Digite o comprimento: m");
                double dimension = sc.nextDouble();
                System.out.print("Escolha o produto: [1-livro/2-Eletronico]");
                int choicePhysicalProduct = sc.nextInt();
                sc.nextLine();
                if (choicePhysicalProduct == 1){
                    pdt = new BookProduct(productName,productPrice,weight,dimension);
                } else if (choicePhysicalProduct == 2) {
                    pdt = new EletronicProduct(productName,productPrice,weight,dimension);
                }
            }
            order.addItem(new OrderItem(quantity,pdt));
        }

        System.out.println("\nRESUMO DO PEDIDO:");
        System.out.println(order);

        sc.close();
    }
}
