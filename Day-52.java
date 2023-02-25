//Day 52 
//Given an integer array of size N, write a program to reverse the array;
import java.util.*;
public class ReverseArray {
    static void reverse(int arr[],int n){
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
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
        reverse(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
                }
}
