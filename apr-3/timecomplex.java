import java.util.Scanner;
public class timecomplex {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i*i<n;i++){
            sum+=i;
        }//time complexity is sqrt of n
    }
}