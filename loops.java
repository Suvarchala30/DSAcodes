import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Hello-world");
        }
        int j=0;
        while(j<n){
            System.out.println("Welcome to Java");
            j++;
        }
    }
}