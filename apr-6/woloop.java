//Print 1 to N without loop
import java.util.Scanner;
public class woloop {
    public void printNos(int n){
        if(n<=0){
            return;
        }
 else{
     printNos(n-1);
     System.out.println(n + " ");
 }
    }
  
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        woloop sc = new woloop();
        sc.printNos(n);
       
    }
}