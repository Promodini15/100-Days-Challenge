//DAY-22
//Write a program to express a number as a sum of two prime numbers
import java.util.*;
public class SumOfPrime{
    static int prime(int n){
        int i, isPrime=1;
        for(i=2;i<=n/2;i++){
            if(n%2==0){
                isPrime=0;
            }
           
        }
         return isPrime;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<=num/2;i++){
            if(prime(i)==1){
                if(prime(num-i)==1){
                    System.out.println(num+" can be expressed as sum of "+ i+" and "+ (num-i));
                    flag=1;
                }
            }          
        }
        if(flag==0){
            System.out.println(num+"cannot be expressed as two prime numbers");
        }       
    }
}
