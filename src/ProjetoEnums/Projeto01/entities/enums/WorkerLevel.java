package ProjetoEnums.Projeto01.entities.enums;

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



}
