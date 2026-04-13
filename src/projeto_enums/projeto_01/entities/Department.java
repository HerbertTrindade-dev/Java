package projeto_enums.projeto_01.entities;

public abstract class Department {

     private Integer additional;

     public Department() {
     }

     public Department(Integer additional) {
          this.additional = additional;
     }

     public Integer getAdditional() {
          return additional;
     }

     public void setAdditional(Integer additional) {
          this.additional = additional;
     }

     public double getOvertimeRate(){
          return 0;
     }

     public double getSalary(){
          return 0;
     }



}



