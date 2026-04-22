package projeto_POO.projeto_01.model.enums;

public enum WorkerLevel {

    JUNIOR(0.05,0),
    PLENO(0.10,1),
    SENIOR(0.15,2);

    private final double increaseSalary;
    private final int code;

    WorkerLevel (double increaseSalary,int code){
        this.increaseSalary = increaseSalary;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public double getIncreaseSalary() {
        return increaseSalary;
    }

    public static WorkerLevel fromCode(int code){
        for (WorkerLevel level : WorkerLevel.values()){
            if (level.getCode() == code) {
                return level;
            }
        }
        throw new IllegalArgumentException("Código não econtrado: "+code);
    }


}
