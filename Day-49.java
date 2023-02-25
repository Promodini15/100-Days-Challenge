//Day 49  
//Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.
import java.util.*;
public class ScalarProduct {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2 =new int[n];
        int product=1,sum=0;
        System.out.println("enter 1st array elements");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter 2nd array elements");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int j=n-1;
        for(int i=0;i<n;i++){
           while(j>=0){
                product=arr1[i]*arr2[j];
                sum=sum+product;
               j--;
               break;
            }
        }
        System.out.println(sum);
    }
}
