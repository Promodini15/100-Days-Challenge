//Day-6
//Write a program to find the Quadrants in which coordinates lie
package javaapplication1;
import java.util.*;
public class CheckQuadrant {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>0&&b>0){
            System.out.println("This point lies in first quadrant");
        }
        else if(a<0&&b>0){
        System.out.println("This point lies in second quadrant");
    }
        else if(a<0&&b<0){
        System.out.println("This point lies in third quadrant");
    }
        else if (a>0&&b<0){
            System.out.println("This point lies in fourth quadrant");
        }
        else{
            System.out.println("This point lies in origin");
        }
        
        
    }
}
