package projeto_enums.projeto_01.entities;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    private String name;
    private List<Worker> workerListList = new ArrayList<>();

    public Enterprise(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addWorker(Worker worker){
        workerListList.add(worker);
    }

    public void removeWorker(Worker worker){
        workerListList.remove(worker);
    }
}
