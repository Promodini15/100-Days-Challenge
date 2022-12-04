//DAY-17
//Write a program to find the Factors of a number
import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
    }
}
