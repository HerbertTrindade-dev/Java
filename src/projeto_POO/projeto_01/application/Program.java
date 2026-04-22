package projeto_POO.projeto_01.application;

import projeto_POO.projeto_01.model.entities.*;
import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);



        System.out.println("=======REGISTRO SALARIAL========");
        System.out.print("Quantidade de Funcionários:");
        int qtdEmployee = sc.nextInt();
        for (int i = 0; i < qtdEmployee; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Digite os dados do servidor #" + (1 + i) + ":");

            int level = sc.nextInt();
            System.out.print();
            sc.nextLine();
           



        }

    }
}
