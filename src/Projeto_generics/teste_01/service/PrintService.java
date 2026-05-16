package Projeto_generics.teste_01.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T values) {
        list.add(values);
    }

    public List<T> getList() {
        return list;
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista nao pode ser vazia");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1;i< list.size();i++){
            System.out.print(","+list.get(i));
        }
            System.out.print("]");
    }
}
