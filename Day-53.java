//Day 53
//Given an integer array of size N. Write Program to find maximum product subarray in a given array.
import java.util.*;
public class ProductSubarray {
    static int maximumsubarray(int[]arr,int n){
        int ans=arr[0];
        for(int i=0;i<n;i++){
            int product=arr[i];
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,product);
                 product=product*arr[j];
            }
            ans=Math.max(ans,product);
        }
        return ans;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=maximumsubarray(arr,n);
        System.out.println(result);
    }
    
}
