//DAY-24
//Program to print pyramid pattern using stars
import java.util.*;
public class Pyramid {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
                for(int k=1;k<=(2*i)-1;k++){
                    System.out.print("*");
                }
                System.out.println("");
            }   
     }  
}
