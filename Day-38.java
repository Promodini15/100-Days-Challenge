//Day 38
//Write a Program to print Non-repeating characters in a string
import java.util.*;
public class Non_repeating {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
       int frequency[]=new int[str.length()];
        char strnew[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            frequency[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(strnew[i]==strnew[j]){
                  frequency[i]++;
                  strnew[j]='0'; 
                }
            }
        }
        for(int i=0;i<str.length();i++){
            if(strnew[i]!=';'&& strnew[i]!='0'){
            if(frequency[i]==1){
                System.out.print(strnew[i]+" ");
            }
            }
        }
        
    }
    
}
