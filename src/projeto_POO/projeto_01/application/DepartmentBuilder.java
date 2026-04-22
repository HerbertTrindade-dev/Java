package projeto_POO.projeto_01.application;

import projeto_POO.projeto_01.model.entities.*;
import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DepartmentBuilder {
    private final DateTimeFormatter fmt;
    private final Scanner sc;

    public DepartmentBuilder(DateTimeFormatter fmt, Scanner sc){
        this.fmt = fmt;
        this.sc = sc;
    }

    public Worker readWorker() {
        System.out.print("Nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY):");
        LocalDate birthday = LocalDate.parse(sc.next(), fmt);
        System.out.print("Digite os dias trabalhados:");
        int daysWork = sc.nextInt();
        return new Worker(name, birthday, daysWork);
    }

    public Department readDepartment(Worker worker) {
        System.out.println("=======REGISTRO SALARIAL========");
        System.out.print("Quantidade de Funcionários:");
        int qtdEmployee = sc.nextInt();
        for (int i = 0; i < qtdEmployee; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Digite os dados do servidor #" + (1 + i) + ":");
            System.out.print("Nivel-[0-JUNIOR;1-PLENO;2-SENIOR]:");
            int level = sc.nextInt();
            System.out.print("Digite o nome do departamento:[Administracao/Vendas/Recepcao]");
            sc.nextLine();
            String nameDepartment = sc.nextLine().toLowerCase();
            if (nameDepartment.equals("administracao")) {
                System.out.print("Digite a quantidade de projetos feitos:");
                int additionalProject = sc.nextInt();
                dpt = new AdminDept(additionalProject, WorkerLevel.searchId(level), nameDepartment);
            } else if (nameDepartment.equals("vendas")) {
                System.out.print("Digite a quantidade de vendas realizadas:");
                int additionalSales = sc.nextInt();
                dpt = new SalesDept(additionalSales, WorkerLevel.searchId(level), nameDepartment);
            } else {
                System.out.print("Digite a quantidade de pessoas atendidas:");
                int additionalRecepcion = sc.nextInt();
                dpt = new RecepcionDept(additionalRecepcion, WorkerLevel.searchId(level), nameDepartment);
            }
        }
    }

}
