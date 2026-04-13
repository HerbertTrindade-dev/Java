package CursoMaratonaJava.POO.Enums.Ex01.entities.enums;

public enum Cores {
    VERDE(1,"Verde"){
        @Override
        public void sinalizacao() {
            System.out.println("Siga em frente");
        }
    },
    AMARELO(2,"Amarelo"){
        @Override
        public void sinalizacao() {
            System.out.println("Atencao");
        }
    },
    VERMELHO(3,"Vermelho"){
        @Override
        public void sinalizacao() {
            System.out.println("Pare");
        }
    };

    private Integer numeroCor;
    private String nomeCores;
    Cores(Integer numeroCor,String nomeCores){
        this.numeroCor = numeroCor;
        this.nomeCores = nomeCores;
    }

    public abstract void sinalizacao();

    public Integer getNumeroCor() {
        return numeroCor;
    }

    public String getNomeCores() {
        return nomeCores;
    }
}
