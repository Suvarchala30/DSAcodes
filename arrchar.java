
import java.util.Scanner;
public class arrchar {
    public static void main(String[] args){
        char[] arr={'H','e','l','l','o'};
        System.out.println(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.charAt((5)));
        System.out.println(name.length());
//strings are immutable we cannot modify content rather can change completely
     }
}