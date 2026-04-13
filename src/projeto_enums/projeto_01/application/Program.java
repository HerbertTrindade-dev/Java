package projeto_enums.projeto_01.application;

import projeto_enums.projeto_01.entities.*;
import projeto_enums.projeto_01.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            System.out.println("Digite os dados do servidor #" +(1+i) + ":");
            System.out.print("Departamento (1-ADM, 2-Vendas, 3-Recpção):");
            int deptChoice = sc.nextInt();
            switch (deptChoice){
                case 1:
                    Department adminDept = new AdminDept();
                    break;
                case 2:
                    Department salesDept = new SalesDept();
                    break;
                case 3:
                    Department recepcionDept = new RecepcionDept();
                    break;
                default:
                    System.out.println("Departamento não encontrado");
            }
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Data de nascimento (DD/MM/YYYY):");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Nivel-[0-JUNIOR;1-PLENO;2-SENIOR]:");
            int level = sc.nextInt();

            System.out.print("Digite a quantidade de dias trabalhados:");
            int qtdDaysWork = sc.nextInt();
            System.out.print("Houve prestação de serviço extra: [s/n]");
            char choice = sc.next().charAt(0);
            if (choice == 's') {
                System.out.println("Digite a quantidade de horas extras:");
                int overtime = sc.nextInt();
            } else {

            }
        }
        System.out.println();
        System.out.println("Digite o periodo para o calculo do valor total(MM/YYYY):");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        sc.close();
    }
}
