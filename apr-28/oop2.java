class Employees{
    
    //constructor - similar to methods but to initilaize an object
    //doesn't have rerurn type
    //default constructor
    Employees(){
       this.employeeId=123;
       this.name="Suvarchala";
    }
    Employees(int eId,String nme){
        this.employeeId=eId;
        this.name=nme;
    }

    int employeeId;
    String name;
    void work(){
       
        System.out.println(this.name + " is working");
    }
}
public class oop2 {
    public static void main(String[] args){
        Employees emp1= new Employees();//using default constructor
        

        Employees emp2=new Employees(2,"Ram");//using parameter constructor
        

        System.out.println(emp1.name + emp1.employeeId);
        System.out.println(emp2.name + emp2.employeeId);

        emp1.work();
        emp2.work();
       
    }
}