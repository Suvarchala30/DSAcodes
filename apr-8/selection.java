import java.util.Scanner;

public class selection {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void selectionSort(int[] arr){
        int n=arr.length;
        

        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j=i;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
           
            swap(arr,i,minIndex);

        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}