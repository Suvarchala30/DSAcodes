public class findindex {
    public static void main(String[] args){
        int[] arr={5,6,7,1,2,3,4};

        int target=3;

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.println(i);
            }
        }

    }
}
//Brute force means linear search
//Search in rotated sorted array