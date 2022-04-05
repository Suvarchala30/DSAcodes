import java.util.Scanner;
public class fact {
    static int calculate(int n){
        if(n==1){
            return 1;
        }
        int ans = calculate(n-1)*n;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = calculate(n);
        System.out.println(ans);
    }
}

// static int calculateFactorial(int n){
//     if(n==1){
//         return 1;
//     }
//     int ans = calculateFactorial(n-1) * n;
//     return ans;
// }
// public static void main(String[] args) {
//     int ans = calculateFactorial(5);
//     System.out.print(ans);
// }