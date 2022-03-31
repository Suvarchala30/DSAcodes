public class array2d {
    public static void main(String[] args){
        int arr[]={1,2,3};
        int arr2[]={4,5,6};
        int arr3[] = {7,8,9};
        int[][] array = {arr,arr2,arr3};
        System.out.println(array.length);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
              
            }
            System.out.println();
        }
    }
}