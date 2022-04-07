import java.util.Scanner;
public class summofdigits {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int sum = 0;
        while(n>0){
            sum +=(n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}