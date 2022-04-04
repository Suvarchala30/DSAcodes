import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int a=sc.nextInt(), b=sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                 System.out.println(a-b);
                 break;
            case 3:
                 System.out.println(a*b);
                 break;

            case 4:
            System.out.println(a%b);
            break;

            case 5:
            System.out.println(a/b);
            break;

            default:
            System.out.println((float)a/b*100);
            break;
        }
    }
}