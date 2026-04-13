package projeto_enums.projeto_01.entities;

public abstract class Department{

     private String name;

     public Department (){
     }

     public Department (String name){
         this.name = name;
     }

     public String getName(){
          return name;
     }

     public void setName(String name){
          this.name = name;
     }

     @Override
     public String toString() {
          return  name;
     }
}



