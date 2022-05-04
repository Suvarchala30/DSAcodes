class Employee{
    //attributes
    int employeeId;//private int employeeid - doesn't allow to modify or use or print - to print this emp1.getName or emp1.getemployeeId should be used
    String name;

    //methods
    void work(){
        //to print name of the object we are referring to and then print 'is working'
        //emp1.work() = Suvarchala is working
        System.out.println(this.name + " is working");
    }
}
public class oop {
    public static void main(String[] args){
        Employee emp1= new Employee();
        emp1.name="Suvarchala";
        emp1.employeeId=1;

        Employee emp2=new Employee();
        emp2.name="DSA";
        emp2.employeeId=2;

        System.out.println(emp1.name + emp1.employeeId);
        System.out.println(emp2.name + emp2.employeeId);

        emp1.work();
        emp2.work();
    }
}