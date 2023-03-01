//Day 58
/*Nejiya has a bucket having a capacity of K liters. It is already filled with X liters of water.
Find the maximum amount of extra water in liters that Nejiya can fill in the bucket without overflowing.*/
import java.util.*;
public class BucketFilling {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of testcases");
        int t=sc.nextInt();
         System.out.println("enter number of k and x ");
        int k[]=new int[t];
        int x[]=new int[t];
        for(int i=0;i<t;i++){
            k[i]=sc.nextInt();
            x[i]=sc.nextInt();   
        }
        for(int i=0;i<t;i++){
            System.out.println(k[i]-x[i]);
            
        }
    }
}
