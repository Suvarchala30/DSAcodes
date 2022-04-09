import java.util.Scanner;

public class selection {
    static int[] selectionSort(int[] arr){
        int n=arr.length;
        int[] sortedArray = new int[n];
        int index = 0;

        for(int i=0;i<n;i++){
            int minIndex = 0;
            for(int j=0;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=i;
                }
            }
            sortedArray[index]=arr[minIndex];
            index++;
            arr[minIndex]=Integer.MAX_VALUE;

        }
        return sortedArray;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       arr = selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}