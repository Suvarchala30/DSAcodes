import java.util.*;

public class condition {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age<18){
            System.out.println("User is child");
        }else if(age>=18 && age<=60) {
            System.out.println("User is adult");
        }else{
            System.out.println("User is senior");
        }
    }
}