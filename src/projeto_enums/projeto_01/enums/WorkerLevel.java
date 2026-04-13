package projeto_enums.projeto_01.enums;

public enum WorkerLevel {

    JUNIOR(0.05,0),
    PLENO(0.10,1),
    SENIOR(0.15,2);

    private final double increaseSalary;
    private final int id;

    WorkerLevel (double increaseSalary,int id){
        this.increaseSalary = increaseSalary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getIncreaseSalary() {
        return increaseSalary;
    }

    public static WorkerLevel searchId(int id){
        for (WorkerLevel level : WorkerLevel.values()){
            if (level.getId() == id) {
                return level;
            }
        }
        return null;
    }


}
