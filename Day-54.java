//Day 54 
//Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.
import java.util.*;
public class DisjointArray {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array 1");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("enter array elements ");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of array 2");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        int count=0;
        System.out.println("enter array elements");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("not a disjoint");
        }
        else{
            System.out.println("Disjoint");
        }
}
}
