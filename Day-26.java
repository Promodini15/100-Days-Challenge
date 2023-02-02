//Day-26
//Write a program to calculate Maximum number of handshakes
import java.util.*;
public class Handshake {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter number of people");
    int n=sc.nextInt();
    int handshake= n*(n-1)/2;
        System.out.println("Number of Handshakes are: " +handshake);  
    } 
}
