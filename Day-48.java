//Day 48  
//Write Program to remove duplicate elements in an array
import java.util.*;
public class RemoveDuplicate {
    static int duplicate(int arr[],int n){
    int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
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
        int j=duplicate(arr,n);
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }  
}
                           
