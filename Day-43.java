//Day 43
//Write Program to find the array type
import java.util.*;
public class ArrayType {
    public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of  array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("odd");
        }
        else if(count==n){
        System.out.println("even");
    }
        else{
            System.out.println("mixed");
        }
  
}
}
