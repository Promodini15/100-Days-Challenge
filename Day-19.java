//DAY-19
// Write a program to identify if the number is Armstrong number or not
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
 int temp = num;
 int result=0;
 int n=0;
 int rem;
 while (num != 0)
 {
 num /= 10;
 n++;
 }
 num = temp;
 while (num != 0)
 {
 rem = num%10;
 int mul=1;
 for(int i=1;i<=n;i++) {
 mul=mul*rem;
 }
 result=result+mul;
 num /= 10;
 }
 if(result==temp)
 System.out.println("Armstrong Number");
 else
 System.out.println("Not Armstrong number");
}
}

        
    