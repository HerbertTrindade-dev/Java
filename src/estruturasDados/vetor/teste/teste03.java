package estruturasDados.vetor.teste;

import estruturasDados.vetores.Vetor;

public class teste03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5,0);
        vetor.adiciona("Posicao 0");
        vetor.adiciona("Posicao 1");
        vetor.adiciona("Posicao 2");
        vetor.adiciona("Posicao 3");
        vetor.adiciona("Posicao 4");
        System.out.println(vetor.tamanho());
        System.out.println(vetor);
    }
}
