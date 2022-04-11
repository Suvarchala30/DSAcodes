import java.util.Scanner;
public class insertion {
    static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int valueToBeInserted=arr[i];
            int correctIndex=0;
            for(int j=i-1;j>=0;j--){
                
                if(arr[j]>valueToBeInserted){
                    arr[j+1]=arr[j];
                }
                else{
                    //correct positiin to insert the value is at index j+1
                    correctIndex=j+1;
                    break;
                }
            }
            arr[correctIndex]=valueToBeInserted;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        insertionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}