import java.util.Scanner;
public class array2dques {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        int n=sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                //System.out.println(arr[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}