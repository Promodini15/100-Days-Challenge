//Day 29
//Write a Program to concatenate a string.
import java.util.*;
public class ConcatenateString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String string1=sc.next();
        System.out.println("enter second string");
        String string2=sc.next();
        System.out.println("concatenated string: "+(string1+string2));
    } 
}
