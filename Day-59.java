//Day 59
/*You are given the height H (in metres) and mass M (in kilograms) of Anusree. The Body Mass Index (BMI) of a person is computed as M/H^2.
Report the category into which Anusree falls, based on his BMI: */
import java.util.*;
public class Bmi {
     public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Testcase:");
         int t=sc.nextInt();
         int bmi=0;
         int[]m=new int[t];
         int[]h=new int[t];
         System.out.println("enter mass(in kilograms) and height(in metres)");
         for(int i=0;i<t;i++){
             m[i]=sc.nextInt();
             h[i]=sc.nextInt();
         }
         for(int i=0;i<t;i++){
             bmi=m[i]/(h[i]*h[i]);
             if(bmi<=18){
                 System.out.println("1");
             }
             else if (19<=bmi && bmi<=24){
                 System.out.println("2");
             }
             else if(25<=bmi && bmi<=29){
                 System.out.println("3");
             }
             else{
                 System.out.println("4");
             }
 
         }
   
     }
}
