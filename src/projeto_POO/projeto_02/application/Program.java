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

        OrderBuilder orderBuilder = new OrderBuilder(sc,fmt);

        Client client = orderBuilder.readClient();
        Order order = orderBuilder.readOrder(client);
        orderBuilder.readItem(order);

        System.out.println("\nRESUMO DO PEDIDO:");
        System.out.println();

        sc.close();
    }
}
