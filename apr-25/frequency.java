import java.util.Scanner;

public class frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        
        long digit=0;
        
       for(int i=0;i<=9;i++){
           int count=0;
           long temp=n;
           while(temp>0){
            digit=temp%10;
            if(digit==i){
                count++;
            }
            temp=temp/10;
        }
        if(count>0){
            System.out.println(i+" "+count);
        }
       }

    }
}