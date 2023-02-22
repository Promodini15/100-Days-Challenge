//Day-42
//Write Program to check if two arrays are the same or not
import java.util.*;
public class SameArray {
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
        System.out.println("enter size of first array");
        int n1=sc.nextInt();
        System.out.println("enter size of second array");
        int n2=sc.nextInt();
        int []arr1=new int[n1];
        int []arr2=new int[n2];
        System.out.println("enter elements of first array");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter elements of second array");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int count=0;
        sort(arr1,n1);
        sort(arr2,n2);
        
        for(int i=0;i<n1;i++){
            if(arr1[i]==arr2[i]){
                count++;  
            }
        }
        if(count!=n1){
            System.out.println("not same");
        }
        else{
            System.out.println("same");
        }
    }
}
