//Day 75
/*You start eating this candy from one of the ends.
But as it is not your candy, your friend told you to eat exactly K unit length of candy during each bite.
You will stop eating if the candy's length becomes 00.
This means that you have eaten the entire candy.
If at some point of time, the candy's length is positive, but less than K, you cannot take a bite thereafter.*/
import java.util.*;
public class Candies {     
    static void eatcandies(){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int k=sc.nextInt();
       int count =0;
        if(n%k==0){
            
            System.out.println(n/k);
        }
        else {
            System.out.println("-1");
        }    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            eatcandies();
            
        }
    }
}
