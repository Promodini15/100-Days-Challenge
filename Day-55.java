//Day 55 
//Given 2 integer arrays X and Y of same size. Consider both arrays as vectors and print the sum of maximum scalar product (Dot product) of 2 vectors.
import java.util.*;
public class MaximumScalar {
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter 1st array elements ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        System.out.println("enter 2nd array elements");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int sum=0,product=1;
        int j=0; 
        for(int i=0;i<n;i++){                     
            while(j<n){
                product=arr1[i]*arr2[j];
                sum=sum+product;
                j++;
                break;
            }           
        }
         System.out.println(sum);        
}
}
