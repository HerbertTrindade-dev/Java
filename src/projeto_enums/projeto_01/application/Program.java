package projeto_enums.projeto_01.application;

import projeto_enums.projeto_01.entities.*;
import projeto_enums.projeto_01.enums.WorkerLevel;
import projeto_enums.projeto_01.services.CalculationSalary;

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
            System.out.print("Departamento (1-ADM, 2-Vendas, 3-Recpção):");
            int deptChoice = sc.nextInt();
            Department dept = null;

            switch (deptChoice) {
                case 1:
                    System.out.print("Digite a quantidade de projetos feitos:");
                    int additionalProject = sc.nextInt();
                    dept = new AdminDept(additionalProject);
                    break;
                case 2:
                    System.out.print("Digite a quantidade de vendas realizadas:");
                    int additionalSales = sc.nextInt();
                    dept = new SalesDept(additionalSales);
                    break;
                case 3:
                    System.out.print("Digite a quantidade de pessoas atendidas:");
                    int additionalRecepcion = sc.nextInt();
                    dept = new RecepcionDept(additionalRecepcion);
                    break;
                default:
                    System.out.println("Departamento não encontrado");
            }
            System.out.print("Nivel-[0-JUNIOR;1-PLENO;2-SENIOR]:");
            sc.nextLine();
            int level = sc.nextInt();
            System.out.print("Digite os dias trabalhados:");
            int daysWork = sc.nextInt();
            workers.add(new Worker(name,WorkerLevel.searchId(level),birthday,dept,daysWork));
        }
        for(Worker wk : workers){
            System.out.println("------------------------------------");
            System.out.println("======RELATORIO FINANCEIRO======");
            System.out.println("Nome:"+wk.getName());
            System.out.println("Data de nascimento:"+wk.getBirthday());
            System.out.println("Senioridade: "+wk.getLevel());
            System.out.println("Salario: "+wk.getDepartment() );
            System.out.println("Bonus:");
            System.out.println("Salario Total:");



        }



    }
}
