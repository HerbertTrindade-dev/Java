package projeto_POO.projeto_01.model.services;

import projeto_POO.projeto_01.model.entities.Worker;

public class DepartmentReport {
    for (
    Worker wk : workers){
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
