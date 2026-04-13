package projeto_enums.projeto_01.enums;

public enum WorkerLevel {

    JUNIOR(0,"Junior"),
    PLENO(1,"Pleno"),
    SENIOR(2,"Senior");

    private final int id;
    private final String name;

    WorkerLevel (int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
