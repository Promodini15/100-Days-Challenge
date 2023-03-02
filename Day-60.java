//Day 60
/*The weather report of Magicland is Good if the number of sunny days in a week is strictly greater than the number of rainy days.
Given 7 integers A1,A2,A3,A4,A5,A6,A7 where Ai=1 denotes that the ith day of week in Magicland is a sunny day, Ai=0 denotes that the ith day in Magicland is a rainy day. 
Determine if the weather report of Magicland is Good or not.*/
import java.util.*;
public class GoodWeather {                                                                                                                 
         public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
         System.out.println("Testcase:");
         int t=sc.nextInt();
         int k;
         String weather[]=new String[t];
             System.out.println("enter number");
             for(int i=0;i<t;i++){
                 int sunny=0,rainy=0;
                 for(int j=0;j<7;j++){
                     k=sc.nextInt();
                     if(k==1){
                         sunny++;
                     }
                     else{
                     rainy++;
                 }
                 }
                 if(sunny>rainy){
                        weather[i]="yes";                
                 }
                 else{
                      weather[i]="no";
                 }  
             }
             for(int i=0;i<t;i++){
                  System.out.println(weather[i]);
             }
            
}
}
