// Coding Day-1
//Take an input character from the user and check whether the given input is a vowel or consonant.
package javaapplication1;
import java.util.*;
public class CheckVowel {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Given character is a vowel");}
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
        System.out.println("Given character is a Consonant");
        }
        else
        {
        System.out.println("Given character is invalid");
        }
        
    }
}
