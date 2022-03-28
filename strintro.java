import java.util.Scanner;
public class strintro {
    public static void main(String[] args){
        // String s="Hello world";
        // System.out.println((s));
        //step 1 - definin a scanner
        Scanner sc = new Scanner(System.in);
        //step 2 - take input using this scanner
        System.out.println("Enter your age");

        int age = sc.nextInt();
        System.out.println("Your age is: "+ age + "years");

    }
}