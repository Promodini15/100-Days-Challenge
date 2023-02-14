//Day 37
//Write a Program to calculate the Frequency of characters in a string
import java.util.*;
public class Frequency {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        char str1[]=str.toCharArray();
        int frequency[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
            frequency[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(str1[i]==str1[j]){
                    frequency[i]++;
                    str1[j]='0';
                }
            }
        }
         for(int i=0;i<str.length();i++){
             if(str1[i]!=';'&& str1[i]!='0'){
             System.out.println("frequency of "+str1[i]+" is "+frequency[i]);    
         }
           
         }      
}
}
