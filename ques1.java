import java.util.Scanner;
public class ques1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("Sum is " + sum );

       
        String scr = sc.next();

        System.out.println("Input string is " + scr);

       
        String scrtwo = sc.nextLine(); //this prints the rest of code lefy by above line

        System.out.println("Second string is "+scrtwo);


    }
}