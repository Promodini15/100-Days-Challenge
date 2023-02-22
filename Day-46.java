//Day 46 
//Write Program to find sum of elements in an array
import java.util.*;
public class SumOfArray {
    public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of  array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
         System.out.println(sum);
      
}
}
