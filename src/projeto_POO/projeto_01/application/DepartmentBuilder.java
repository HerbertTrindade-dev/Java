package projeto_POO.projeto_01.application;

import projeto_POO.projeto_01.model.entities.*;
import projeto_POO.projeto_01.model.enums.TypeDepartment;
import projeto_POO.projeto_01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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

    public WorkerLevel readLevel(){
        int indexLevel = readInt("Nivel-[1-JUNIOR;2-PLENO;3-SENIOR]:");
        return WorkerLevel.fromCode(indexLevel);
    }

    public Department createDepartment() {
        int indexDepartment = readInt("Digite o departamento:[1-Administracao/2-Vendas/3-Recepcao]");
        TypeDepartment type = TypeDepartment.fromCode(indexDepartment);
        switch (type){
            case ADMINISTRACAO -> createAdminDept();
            case VENDAS -> createSalesDept();
            case RECEPCAO -> createRecepcionDept();

        }

    }

    public Department createAdminDept(WorkerLevel level){
        int qtdProjects = readInt("Digite a quantidade de projetos feitos:");
        return new AdminDept(qtdProjects,level);
    }

    public Department createSalesDept(WorkerLevel level){
        int qtdSales = readInt("Digite a quantidade de vendas realizadas:");
        return new SalesDept(qtdSales,level,name);
    }

    public Department createRecepcionDept(WorkerLevel level){
        int qtdPeoplesAtt = readInt("Digite a quantidade de pessoas atendidas:");
        return new RecepcionDept(qtdPeoplesAtt,level,name);
    }

    public int readInt(String prompt){
        do {
            try{
                System.out.println(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Formato incorreto.Digite um numero inteiro.");
            }
        }while(true);
    }

    public Double readDouble(String prompt){
        do {
            try{
                System.out.println(prompt);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e){
                System.out.println("Formato incorreto.Digite um numero real.");
            }
        }while (true);
    }

    public LocalDate readDate(String prompt){
        do {
            try {
                System.out.println(prompt);
                return LocalDate.parse(sc.nextLine().trim(),fmt);
            }catch (DateTimeParseException e){
                System.out.println("Formato incorreto de data.Utilize (dd/MM/yyyy)");
            }
        }while(true);
    }

}
