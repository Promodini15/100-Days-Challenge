//Day-28
//Write a Program to reverse a string.
import java.util.*;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String string=sc.next();
        String string2="";
        for(int i=string.length()-1;i>=0;i--){
             string2=string2+string.charAt(i);           
        }
          System.out.println(string2);
    }
}
