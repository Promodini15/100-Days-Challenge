//Day 45 
//Write Program to find smallest and largest element in an array
import java.util.*;
public class LargeAndSmall {
    static void sort(int[]a,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                
            }
        }
    }
    public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of  array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elemnts");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,n);
        System.out.println("Smallest number: \n"+arr[0]);
        System.out.println("Largest number: \n"+arr[n-1]);
    }
}
