import java.util.Scanner;
public class arrchar2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name2=sc.nextLine();
        System.out.println(name2);
        System.out.println(name+" "+name2);//string concatination
        System.out.println(name2.concat(" " + name));//this is recommended for concatinating
        System.out.println(name.replace("l","z"));
        System.out.println(name.split("u",2));
    }
}