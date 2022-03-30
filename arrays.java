import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4};
        System.out.println(arr[1]);
        System.out.println(arr.length);
        System.out.println(arr); // this does not return entire array it only returna base address
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
System.out.println();
        int arr2[] = new int[100];
        System.out.println(arr2.length);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");//here output would be 0's for 100 times
        }

        int arr3[] = new int[10];
        for(int i=0;i<5;i++){
           arr3[i]= sc.nextInt();
           
        }
        if(arr.length>=3){
        arr[2]=66;
        }
        for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
        }
    }
}
