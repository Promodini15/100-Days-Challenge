//DAY-20
//Write a program to identify if the number is Prime number or not
import java.util.*;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println(num + " is not a prime number");
        }
        else{
            System.out.println(num + " is a prime number");
        }
    }
}
