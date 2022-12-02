//DAY-13
//Write a program to find Sum of N natural numbers
import java.util.*;
public class SumOfNdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;         
        }
        System.out.println(sum);    
    }    
}
