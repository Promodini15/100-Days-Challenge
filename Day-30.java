//Day 30
//Write a Program to print Length of the string without using strlen() function
import java.util.*;
public class StringLength {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String str1=sc.next();
        int length=0;
        char ch[]=str1.toCharArray();
        for(char c:ch){
            length++;
        }
        System.out.println("length of string is "+length);
    }  
}
