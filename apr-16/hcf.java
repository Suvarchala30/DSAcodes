import java.util.Scanner;

public class hcf {
    static int hcfFun(int a,int b){
        if(b==0){
            return a;
        }
        return hcfFun(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(hcfFun(a,b));
    }
}