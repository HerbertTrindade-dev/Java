package projeto_Excecoes.projeto_01.application;

import projeto_Excecoes.projeto_01.entites.Reservation;
import projeto_Excecoes.projeto_01.exceptions.CurrentDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ReservationReader {

    private final DateTimeFormatter fmt;
    private final Scanner sc;

    public ReservationReader(DateTimeFormatter fmt, Scanner sc) {
        this.fmt = fmt;
        this.sc = sc;
    }

    public int readInt(String message) {
        do {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Numero nao identificado");
            }
        } while (true);
    }

    public LocalDate readDate(String message) {
        do {
            try {
                System.out.print(message);
                return LocalDate.parse(sc.nextLine(), fmt);
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data incorreto");
            }
        } while (true);
    }

    public void readCheck(int roomNumber) throws CurrentDateException {
        LocalDate checkIn = readDate("Data do Check-in (dd/MM/yyyy):");
        LocalDate checkOut = readDate("Data do Check-Out (dd/MM/yyyy):");
        Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
        System.out.println();
        System.out.println(reservation);
    }

    public int readRoom() {
        int roomNumber = readInt("Digite o numero do quarto:");
        return roomNumber;
    }

}
