//Day 32
//Write a Program to Remove vowels from a string
import java.util.*;
public class RemoveVowel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=sc.next();
        String s1="";
        for(int i=0;i<str1.length();i++){
         s1=str1.replaceAll("[aeiou]", "");  
            }
        System.out.println(s1); 
        } 
    }
