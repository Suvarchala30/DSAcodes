import java.util.Scanner;
public class fibrec {

    static int fibo(int n){
            if(n==0){
                return 0;
            }
            if(n==1){
                return 1;
            }

            int ans = fibo(n-1)+fibo(n-2);
            return ans;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int anss = fibo(n);
        System.out.println(anss);
    }
}