import java.util.Scanner;
public class celsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fah = sc.nextInt();
        
        float cel = (fah - 32)*5/9f;
        System.out.println(cel);

    }
}