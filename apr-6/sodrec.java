import java.util.Scanner;
public class sodrec {
    static int getsum(int n){
        if(n==0){
            return 0;
        }

        int ans = getsum(n/10) + (n%10);
        return ans;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

       int sum = getsum(n);
       System.out.println(sum);
       
    }
}