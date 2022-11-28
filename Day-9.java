//Day-9
//Write a program to find Number of digits in an integer
package javaapplication1;
import java.util.*;
public class NumberofDigits {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int number=0;
        while(num!=0){
            ++number;
            num=num/10;
        }
        System.out.println(number);
    }
    
}
