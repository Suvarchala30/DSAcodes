import java.util.Scanner;
public class functions {

    static int myFunction(int a,int b){
        int ans = (a*a + 4)*(b*b +8);
        //System.out.println(ans); // use void insted of int to only print not return
        return ans;
    }

    static float add(float aa , float bb){
        return aa+bb;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = myFunction(a,b);
        System.out.println(answer);

        float aa = sc.nextFloat();
        float bb=sc.nextFloat();

        float ans1 = add( aa , bb );
        System.out.println(ans1);

    
    }
}