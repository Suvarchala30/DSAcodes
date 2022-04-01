import java.lang.*;
import java.util.Scanner;

public class average
{
	public static void main (String[] args)	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum=0;
      for(int i=0;i<n;i++){
          int a = sc.nextInt();
            sum = sum+a;
      }
      int avr = sum/n;
      System.out.println(avr);
	}
}