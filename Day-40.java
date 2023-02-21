//Day 40
//Write a Program to Replace substring in a string
import java.util.*;
public class Substring {
     public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
        System.out.println("enter a  string");
        String str1=sc.next();
        System.out.println("enter the substring to be removed");
        String str2=sc.next();
        System.out.println("Enter the new substring");
        String str3=sc.next();
        String newString=str1.replace(str2,str3);
         System.out.println("New string :"+ newString);
     
     }
}
