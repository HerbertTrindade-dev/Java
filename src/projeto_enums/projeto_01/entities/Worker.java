package projeto_enums.projeto_01.entities;

import projeto_enums.projeto_01.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private LocalDate birthday;
    private Integer daysWork;

    private Department department;
    private List<HourContract> hourContract = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, LocalDate birthday, Department department,Integer daysWork) {
        this.name = name;
        this.level = level;
        this.birthday = birthday;
        this.department = department;
        this.daysWork = daysWork;
    }

    public Worker(String name, WorkerLevel workerLevel, LocalDate birthday, Department dept) {
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel level){
        this.level = level;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public void setBirthday(int birthday){
        this.birthday = this.birthday;
    }

    public Integer getDaysWork() {
        return daysWork;
    }

    public void setDaysWork(Integer daysWork) {
        this.daysWork = daysWork;
    }

    public Department getDepartment() {
        return department;
    }

    public List<HourContract> getHourContract(){
        return hourContract;
    }

    public void addContract(HourContract hourContract){
        this.hourContract.add(hourContract);
    }

    public void removeContract(HourContract hourContract){
        this.hourContract.remove(hourContract);
    }

}
