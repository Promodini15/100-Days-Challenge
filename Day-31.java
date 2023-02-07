//Day 31
//Write a Program to Toggle each character in a string
import java.util.*;
public class Toggle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str1=sc.next();
        String str2="";
        for(int i=0;i<str1.length();i++){
            if(Character.isUpperCase(str1.charAt(i))){
            str2=str2+Character.toLowerCase(str1.charAt(i));
            }
            else{
                str2=str2+Character.toUpperCase(str1.charAt(i));
            }   
        }
        System.out.println("Toggle String:"+str2);
    }
}
