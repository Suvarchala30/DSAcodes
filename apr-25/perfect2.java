//A number is perfect if it's sum of proper divisors is equal to the number itself
//ex: 15 -> 1,3,5 -> 1+3+5 = 9 != 15 so not a perfect number

import java.util.Scanner;

public class perfect2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=1;i<=n;i++){
            int sum=0;
           for(int j=1;j<i;j++){
               if(i%j==0){
                   sum=sum+j;
               }
           }
           if(sum==i){
               System.out.println(sum);
           }
        }
        
    }
}