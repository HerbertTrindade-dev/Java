package estruturasDados.vetores;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade, int tamanho) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elementos) throws IllegalStateException {
        if (this.elementos.length <= this.tamanho) {
            throw new IllegalStateException("Array completo");
        }
        this.elementos[this.tamanho] = elementos;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public String buscaPosicao(int posicao) throws IllegalArgumentException {
        if (!(posicao >= 0 & posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }

    public int buscaNome(String elemento) throws IllegalArgumentException {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Nao existe esse elemento no vetor");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            sb.append(elementos[i]);
            sb.append(",");
        }
        if (this.tamanho > 0) {
            sb.append(this.elementos[tamanho - 1]);
        }
        sb.append("]");
        return sb.toString();
    }

}
