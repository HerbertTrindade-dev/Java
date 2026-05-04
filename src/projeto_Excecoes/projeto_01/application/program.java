package projeto_Excecoes.projeto_01.application;

import projeto_Excecoes.projeto_01.entites.Reservation;
import projeto_Excecoes.projeto_01.exceptions.CurrentDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws CurrentDateException {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do quarto:");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Data do Check-in (dd/MM/yyyy):");
        LocalDate checkIn = LocalDate.parse(sc.nextLine(),fmt);
        System.out.print("Data do Check-Out (dd/MM/yyyy):");
        LocalDate checkOut = LocalDate.parse(sc.nextLine(),fmt);
        Reservation reservation = new Reservation(roomNumber,checkIn,checkOut);
        System.out.println();
        System.out.println(reservation);
        System.out.println();
        System.out.println("Digite a data de atualização da reserva:");
        System.out.print("Data do Check-in (dd/MM/yyyy):");
        LocalDate checkIn2 = LocalDate.parse(sc.nextLine(),fmt);
        System.out.print("Data do Check-Out (dd/MM/yyyy):");
        LocalDate checkOut2 = LocalDate.parse(sc.nextLine(),fmt);
        reservation = new Reservation(roomNumber,checkIn2,checkOut2);
        System.out.println(reservation);

        sc.close();
    }
}
