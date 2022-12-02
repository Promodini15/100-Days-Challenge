//DAY-14
//Write a program to reverse a given number
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int reverse=0;
        while(num>0){
            int temp=num%10;
            reverse=reverse*10+temp;
            num=num/10;
        }
        System.out.println("reverse number :"+reverse);
        
    }
    
}
