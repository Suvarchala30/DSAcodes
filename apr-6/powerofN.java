import java.util.Scanner;
public class powerofN {
    static long power(int a, int b){
        if(b==0){
            return 1L;
        }
        return power(a,b-1) * a;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();

        System.out.println(power(a,b));

       
    }
}