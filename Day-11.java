//DAY-11
//Write a program to find Fibonacci series up to n
import java.util.*;
public class Fibo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter nth term");
        int num= sc.nextInt();
        int n1=0;
        int n2=1;
        if(num==0){
            System.out.print("fibonacci series :"+n1);
        }
        else if(num==1){
            System.out.print("fibonacci series :"+n2);
            
        }
        else{
            System.out.print(n1+","+n2+",");
            for(int i=2;i<num;i++){
                int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+",");
                
            }
            
            
        }
        
                
        
    }
    
}
