//Day 56
//Program to find whether the numbers of an array be made equal
import java.util.*;
public class ArrayEqual {
    static boolean convert(int[]a,int n){
        for(int i=0;i<n;i++){
            while(a[i]%2==0){
                a[i]/=2;
            }
            while(a[i]%3==0){
                a[i]/=3;
            }
            
        }
        for(int i=1;i<n;i++){
            if(a[i]==a[0]){
                return true;
            }
        }
        return false;
    }   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(convert(arr,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("Not possible");
        }
    }
    
}
