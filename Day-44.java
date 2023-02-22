//Day 44
//Write Program to find number of even and odd elements in an array
import java.util.*;
public class EvenAndOdd {
    public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of  array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Number of even elements: "+even);
        System.out.println("Number of odd elements: "+odd);
}
}
