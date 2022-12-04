//DAY-15
//Write a program to identify if the number is Strong number or not
import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int temp=num;       
        int sum=0;
        while(temp>0){   
         int fact=1;
        int rem=temp%10;
        for(int i=rem;i>0;i--){
            fact=fact*i;
        }
        sum=sum+fact;
        temp=temp/10;
    }
        if(sum==num){
             System.out.println("strong number");
        }
        else{
            System.out.println("not a strong number");
        }
       
                
        
    }
    
}
