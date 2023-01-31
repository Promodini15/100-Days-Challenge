//Day-23
//Write a program to Replace all 0’s with 1 in a given integer.
import java.util.*;
public class Replace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int reverse=0,flag=0;
        while(num>0){
            int temp=num%10;
        if(temp==0){
           temp=1;
        }
           num=num/10;
            flag=flag*10+temp;
        
        
        }
        while(flag>0){
            int r=flag%10;
          reverse=reverse*10+r;
            flag=flag/10;
        }
        System.out.println("new number is "+ reverse);
    }   
}
