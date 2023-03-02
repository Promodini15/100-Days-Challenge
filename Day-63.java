//Day-63
/* Manish weight before the lockdown was w1 kg (measured on the most accurate hospital machine) and  
after M months of lockdown, when he measured his weight at home (on a regular scale, which can be inaccurate),
he got the result that his weight was w2 kg (w2>w1).
Scientific research in all growing kids shows that their weights increase by a value between x1 and x2 kg (inclusive) per month, 
but not necessarily the same value each month. Manish assumes that he is a growing kid. 
Tell him whether his home scale could be giving correct results.
 */
import java.util.*;
public class BalancingWeight {
     public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Testcase:");
              int t=sc.nextInt();
              int arr[]= new int[t];
              for(int i =0;i<t;i++){
                  int w1=sc.nextInt();
                  int w2=sc.nextInt();
                  int x1=sc.nextInt();
                  int x2=sc.nextInt();
                  int m=sc.nextInt();
                  x1=x1*m;
                  x2=x2*m;
                  if(x1<=w2-w1 && w2-w1<=x2){
                      arr[i]=1;
                  }
                  else{
                      arr[i]=0;
                  }}
              for(int i=0;i<t;i++){
                  System.out.println(arr[i]);
              }
           
}
}
