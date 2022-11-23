//Day-5
//Get a number as input from the user and check whether the given number is odd or even
package javaapplication1;
import java.util.*;
public class CheckNumber {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}