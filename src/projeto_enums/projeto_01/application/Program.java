package projeto_enums.projeto_01.application;

import projeto_enums.projeto_01.entities.Department;
import projeto_enums.projeto_01.entities.HourContract;
import projeto_enums.projeto_01.entities.Worker;
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

        System.out.print("Quantidade de Funcionários:");
        int qtdEmployee = sc.nextInt();

        for (int i = 0; i < qtdEmployee; i++) {
            System.out.print("Digite o nome do departamento: ");
            String nameDepartment = sc.nextLine();
            System.out.println("Digite os dados do servidor #" + i + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Data de nascimento (DD/MM/YYYY):");
            LocalDate date = LocalDate.parse(sc.next(), fmt);
            System.out.print("Nivel-[0-JUNIOR;1-PLENO;2-SENIOR]:");
            int level = sc.nextInt();
            System.out.print("Digite a quantidade de dias trabalhados:");
            int qtdDaysWork = sc.nextInt();
            System.out.print("Houve prestação de serviço extra:[s/n]");
            char choice = sc.next().charAt(0);
            if (choice == 's') {

            } else {

            }
        }
        Worker worker = new Worker(name, WorkerLevel.values()[level], salary, new Department(nameDepartment));


        for (int i = 1; i <= qtdServices; i++) {


            System.out.print("Valor por hora: R$");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao: ");
            int duration = sc.nextInt();
            sc.nextLine();
            HourContract service = new HourContract(valuePerHour, duration, date);
            worker.addServices(service);
        }
        System.out.println();

        System.out.println("Digite o periodo para o calculo do valor total(MM/YYYY):");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println(worker);
        System.out.print("Resultado final do periodo " + monthAndYear + ": " + worker.income(month, year));


        sc.close();
    }
}
