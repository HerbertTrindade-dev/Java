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
        List<Worker> workers = new ArrayList<>();
        for (int i = 0; i < qtdEmployee; i++) {
            System.out.println("----------------------------------------");
            System.out.println("Digite os dados do servidor #" + (1 + i) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Data de nascimento (DD/MM/YYYY):");
            LocalDate birthday = LocalDate.parse(sc.next(), fmt);
            System.out.print("Digite os dias trabalhados:");
            int daysWork = sc.nextInt();
            Department dpt = null;
            System.out.print("Nivel-[0-JUNIOR;1-PLENO;2-SENIOR]:");
            int level = sc.nextInt();
            System.out.print("Digite o nome do departamento:[Administracao/Vendas/Recepcao]");
            sc.nextLine();
            String nameDepartment = sc.nextLine().toLowerCase();
            if (nameDepartment.equals("administracao")) {
                System.out.print("Digite a quantidade de projetos feitos:");
                int additionalProject = sc.nextInt();
                dpt = new AdminDept(additionalProject,WorkerLevel.searchId(level),nameDepartment);
            } else if (nameDepartment.equals("vendas")) {
                System.out.print("Digite a quantidade de vendas realizadas:");
                int additionalSales = sc.nextInt();
                dpt = new SalesDept(additionalSales,WorkerLevel.searchId(level),nameDepartment);
            } else {
                System.out.print("Digite a quantidade de pessoas atendidas:");
                int additionalRecepcion = sc.nextInt();
                dpt = new RecepcionDept(additionalRecepcion,WorkerLevel.searchId(level),nameDepartment);
            }
            workers.add(new Worker(name,birthday,daysWork,dpt));
        }
        for (Worker wk : workers){
            System.out.println("------------------------------");
            System.out.println("======RELATORIO SALARIAL======");
            System.out.println("Nome:"+wk.getName());
            System.out.println("Data de nascimento:"+wk.getBirthday());
            System.out.println("Departamento:"+wk.getDepartment().getName());
            System.out.println("Senioridade:"+wk.getDepartment().getLevel());
            System.out.println("Bonus: R$"+wk.bonusAmount());
            System.out.println("Salario: R$"+wk.salary());


        }


    }
}
