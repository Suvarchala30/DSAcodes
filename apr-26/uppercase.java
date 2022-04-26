import java.util.Scanner;

public class uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        System.out.println( findupper(str,0,0));
    }
     public static int findupper(String str,int i,int count){
       if(str.length()==i){
           return count;
           //return 0;
       }
       if(Character.isUpperCase(str.charAt(i))){
           count++;
           //return str.charAt(i);
       }
       return findupper(str,i+1,count);
     }
}

//find the no. of upper case letter in a string
//To find 1st occurance use char instaed of int in sub-function