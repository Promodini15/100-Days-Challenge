//Day 51 
//Given an integer array of size N, write a program to sort the array;
import java.util.*;
public class SortArray {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp;
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if (arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
}
}
