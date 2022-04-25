//A number is perfect if it's sum of proper divisors is equal to the number itself
//ex: 15 -> 1,3,5 -> 1+3+5 = 9 != 15 so not a perfect number

import java.util.Scanner;

public class perfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
            System.out.print("Perfect");
        }else{
            System.out.print("Not perfect");
        }
    }
}