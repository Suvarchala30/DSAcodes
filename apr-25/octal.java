import java.util.Scanner;
public class octal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        digits(n);       
    }
public static void digits(int n){
    int val=1,ans =0;
    while(n!=0){
        int rem=n%8;
        ans=ans+rem*val;
        val=val*10;
        n=n/8;
    }
    System.out.println(ans);
}
   
}//This program is not visible here check in any online compiler