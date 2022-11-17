//Day-2
//Take an input character from user and check whether it is an alphabet or not.
package javaapplication1;
import java.util.*;
public class CheckAlphabet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        if((c>='a' && c<='z')|| (c>='A' && c<='Z')){
        System.out.println("Alphabet");
    }
        else{
                System.out.println("Not an Alphabet");
                }
    }
}
