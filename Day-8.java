//DAY-8
//Write a program to find roots of a quadratic equation
package javaapplication1;
import java.util.*;
import java.io.*;
public class FindRoots {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,c");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float deter=((b*b)-(4*a*c));
        if(deter>0){
            System.out.println("two real roots");
            System.out.println("Root 1="+(-b+Math.sqrt(deter))/(2*a)+"Root 2="+(+b+Math.sqrt(deter))/(2*a));
        }
        else if(deter==0){
            System.out.println("roots are equal");
            System.out.println("Root 1= Root 2= "+-b / (2 * a));
        }
        else{
            System.out.println("no real roots");
            System.out.println("");
            float real = -b / (2 * a);
      float imaginary = (float) (Math.sqrt(-deter) / (2 * a));
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
           
        
    }
}
