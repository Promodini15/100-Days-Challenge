//Day-4
//Get an input number from the user and check whether it is a positive or negative number.
package javaapplication1;
import java.util.*;
public class NumberCheck {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive Number");
        }
        else if(n<0){
            System.out.println("Negative Number");
            
        }
        else{
            System.out.println("Neither positive nor negative");
        }
        
    }
}
