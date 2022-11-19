//Day-3
//Get an input character from the user and give the ASCII value of the given input as the output.

package javaapplication1;
import java.util.*;
public class FindAscii {
    public static void main(String[]args){
        System.out.println("Enter a character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int ascii=c;
        System.out.println(ascii);
        
        
        
    }
}
