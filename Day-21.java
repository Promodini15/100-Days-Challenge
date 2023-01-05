//DAY-21
//Write a program to identify if the number is Palindrome or not
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int num=sc.nextInt();
    int temp=num;
    int flag=0;
    while(temp>0){
    int digit=temp%10;
    flag= flag*10 + digit;
    temp=temp/10;
}   
    if(temp==num){
     System.out.println("Palindrome");
}
    else{
    System.out.println("Not a Palindrome");
    
}
    }
}
