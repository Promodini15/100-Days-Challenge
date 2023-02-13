//Day 36
//Write a Program to Capitalize the first and last letter of each word of a string
import java.util.*;
public class Capitalize {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        String newstring="";
        String[] str1=str.split("//s");
        int length=str.length();
        for(String ch:str1){
            String f=ch.substring(0,1);
            String r=ch.substring(1,length-1);
            String l=ch.substring(length-1);
            newstring=newstring+f.toUpperCase()+r+l.toUpperCase();
           
        }
        System.out.println(newstring);
          
    }
}
