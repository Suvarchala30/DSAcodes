import java.util.Scanner;
public class continues {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] fruits = new String[n];
        for(int i=0;i<n;i++){
            fruits[i]=sc.next();
        }
        String query=sc.next();
        for(int i=0;i<n;i++){

        System.out.println("Searching at index" + i);
            if(fruits[i].equals(query)){
               continue;
            }
            System.out.println(i);
        }
    }
}