import java.util.Scanner;
public class strcomp {
    public static void main(String[] args){
        String str1 = "abc";
        String str2="af";
        
        System.out.println(str1.compareTo(str2));//if the value is -ve str1 is smaller else str2
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a.substring(2,5));
    }
}