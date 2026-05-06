package Projeto_Interfaces.projeto_01.application;

import Projeto_Interfaces.projeto_01.entities.CarRental;
import Projeto_Interfaces.projeto_01.entities.Invoice;
import Projeto_Interfaces.projeto_01.entities.Vehicle;
import Projeto_Interfaces.projeto_01.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro:");
        String nameCar = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime startDate = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm):");
        LocalDateTime finishDate = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Digite o preco por hora:");
        double pricePerHour = sc.nextDouble();
        System.out.print("Digite o preco por dia:");
        double pricePerDay = sc.nextDouble();
        RentalService rs = new RentalService(pricePerDay,pricePerHour);







        sc.close();
    }
}
