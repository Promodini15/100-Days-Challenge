//Day 62
/*Anusree has decided to go to a gold mine along with N of his friends (thus, total N+1 people including Anusree go to the gold mine).
The gold mine contains a total of X kg of gold. Every person has the capacity of carrying up atmost Y kg of gold.
Will Anusree and his friends together be able to carry up all the gold from the gold mine assuming that they can go to the mine exactly once.
 */
import java.util.*;
public class GoldMining {
    public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Testcase:");
              int t=sc.nextInt();
              String arr[]=new String[t];
              for(int i=0;i<t;i++){
                  int n=sc.nextInt();
                  int x=sc.nextInt();
                  int y=sc.nextInt();
                  if((n+1)*y>x){
                      arr[i]="yes";
                  }
                  else{
                      arr[i]="no";
                  }
              }
              for(int i=0;i<t;i++){
                   System.out.println(arr[i]);
              }
             
}
}

