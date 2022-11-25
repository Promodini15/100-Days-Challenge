//Day-7
//Write a program to find Number of days in a given month of a given year
package javaapplication1;
import java.util.*;
public class FindDays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month");
        int month=sc.nextInt();
        System.out.println("Enter year");
        int year=sc.nextInt();
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 days");
        }
        else if((month==2 && year%400==0) || (year%100!=0 && year%4==0)){
            System.out.println("29 days");
            
        }
        else if(month==2){
            System.out.println("28 days");
            
        }
        else{
            System.out.println("30 days");
        }
              
    }
    
}
