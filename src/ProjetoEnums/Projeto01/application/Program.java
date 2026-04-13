package ProjetoEnums.Projeto01.application;

import ProjetoEnums.Projeto01.entities.Department;
import ProjetoEnums.Projeto01.entities.Services;
import ProjetoEnums.Projeto01.entities.Worker;
import ProjetoEnums.Projeto01.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do departamento: ");
        String nameDepartment = sc.nextLine();
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Nivel-[0-JUNIOR;1-PLENO;2-SENIOR]:");
        int level = sc.nextInt();
        System.out.print("Salario: R$");
        double salary = sc.nextDouble();

        Worker worker = new Worker(name,WorkerLevel.values()[level],salary, new Department(nameDepartment));


        System.out.print("Quantos servicos foram prestados:");
        int qtdServices = sc.nextInt();

        for (int i=1; i <= qtdServices; i++){
            System.out.println("Digite os dados do #"+i+" servico:");
            System.out.print("Data (DD/MM/YYYY):");
            LocalDate date = LocalDate.parse(sc.next(),fmt);
            System.out.print("Valor por hora: R$");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao: ");
            int duration = sc.nextInt();
            sc.nextLine();
            Services service = new Services(valuePerHour,duration,date);
            worker.addServices(service);
        }
        System.out.println();

        System.out.println("Digite o periodo para o calculo do valor total(MM/YYYY):");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println(worker);
        System.out.print("Resultado final do periodo "+monthAndYear+": "+worker.income(month,year));







        sc.close();
    }
}
