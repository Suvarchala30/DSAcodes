import java.util.Scanner;
public class ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i=0;i<=n;i++){
        //     int x=sc.nextInt();
        //     int y = sc.nextInt();
        //     System.out.println(x+y);
        // }

        while(n>=0){
            System.out.println("Enter number again: ");
            n = sc.nextInt();
        }
    }
}