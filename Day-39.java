//Day-39
//Write a Program to check if two strings are Anagram or not
import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a first string");
        String str1=sc.next();
        System.out.println("enter a second string");
        String str2=sc.next();
        boolean temp=false;
        if(str1.length()==str2.length()){
            char[]arr1=str1.toCharArray();
            char[]arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            temp=Arrays.equals(arr1,arr2);
        }
        if(temp){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    } 
}
