//DAY-18
//Write a program to Add two fractions
import java.util.*;
public class AddFraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first fraction");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter second fraction");
         int x2=sc.nextInt();
        int y2=sc.nextInt();
        int x3=(x1*y2)+(x2*y1);
        int y3=y1*y2;
        int div;
        if(x3>y3){
            div=y3;           
        }
        else{
            div=x3;
        }
        for(int i=div;i>0;i--){
            if(x3%i==0 && y3%i==0){
                x3=x3/i;
                y3=y3/i;
            }
        }
        System.out.print("sum of fraction: ");
        System.out.print(x3+"/"+y3);
    }
    
}
