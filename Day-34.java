//Day-34
//Write a Program to Remove brackets from an algebraic expression
import java.util.*;
public class RemoveBrackets {
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=sc.next();
        String str2="";
        for(int i=0;i<str1.length();i++){
            str2=str1.replaceAll("[(){}]","");
        }
        System.out.println(str2);
    }
}
