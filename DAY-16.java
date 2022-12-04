//DAY-16
// Write a program to identify if the number is Perfect number or not
import java.util.*;
public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
                
            }
        }
        if(sum==num){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");        }
    }    
}
