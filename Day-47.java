//Day-47
//Write a program to find longest palindrome in an array.
import java.util.*;
public class LongestPalindrom {
    static int Palindrome(int a ){
        int i,temp=0,number=a,rem=0,palindrome=0;
        while(a>0){
           rem=a%10;
            temp=temp*10+rem;
            a=a/10;
        }
        if(number==temp){        
           palindrome=temp;
        }
        return palindrome;
    }
    public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of  array");
        int n=sc.nextInt();
        int[] arr=new int[n];
         int[] arr1=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr1[i]=Palindrome(arr[i]);
        }
        int max=arr1[0];
        for(int i=0;i<n;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println(max);  
}
}
