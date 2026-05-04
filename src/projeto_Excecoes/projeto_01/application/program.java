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

        BuilderReservation br = new BuilderReservation(fmt,sc);
        int roomNumber = br.readRoom();
        br.readCheck(roomNumber);
        System.out.println("Digite os dados para atualizar a reserva:");
        br.readCheck(roomNumber);
        sc.close();
    }
}
