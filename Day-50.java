//Day 50 
///Given an integer array of size N. Write Program to find sum of positive square elements in the array.
import java.util.*;
public class PositiveSquare {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int product=1,sum=0;
        System.out.println("enter 1st array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            product=arr[i]*arr[i];
            sum=sum+product;
        }
        System.out.println(sum);
}
}
