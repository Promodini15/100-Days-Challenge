//Day 86
/*Mahesh got a beautiful array named A as a birthday gift from his beautiful girlfriend Namratha. 
There are N positive integers in that array. Mahesh loved the array so much that he started to spend a lot of time on it everyday.
One day, he wrote down all possible subsets of the array. Then for each subset, he calculated the sum of elements in that subset and wrote it down on a paper. 
Unfortunately, Mahesh lost the beautiful array :(. He still has the paper on which he wrote all subset sums. 
Your task is to rebuild beautiful array A and help the couple stay happy :)*/

import java.util.*;

public class MaheshArray {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t -->0){
           int n=sc.nextInt();
           int arr[] = new int[1<<n];
           for(int i=0;i<Math.pow(2,n);i++){
               arr[i]=sc.nextInt();
           }
           int Arr1[]=BeautifulArray(arr);
           for(int i=0;i<n;i++){
            System.out.print(Arr1[i]+" ");
        }
           
       }
    }
    public static int[] BeautifulArray(int[] subsets){
        Arrays.sort(subsets);
        int n1=subsets.length;
        int[] array=new int[n1];
        for(int i=0;i<n1;i++){
            if(i==0){
            array[i]=subsets[i+1]-subsets[i];
            }
            if(i%2==0 && i+1<n1&& i!=0){
            array[i-1]=subsets[i+1]-subsets[i];
            }
        }
        
        return array;
    }
}
