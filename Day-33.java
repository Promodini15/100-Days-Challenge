//Day 33
//Write a Program to check if String is a palindrome or not
import java.util.*;
public class StringPalindrome {
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        String str1="";
        int i=0,j=str.length()-1;
        for(i=j;i>=0;i--)
       {
            str1=str1+str.charAt(i);            
            }
        if(str.equals(str1)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }   
     }
     }
