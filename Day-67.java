//Day-67
/*
Arunima stacked three bricks on top of each other. Initially, their widths (from top to bottom) are W1,W2,W3.
Arunima strength is S. Whenever she hits a stack of bricks, consider the largest k≥0 such that the sum of widths of the topmost k bricks does not exceed S
the topmost k bricks break and are removed from the stack. Before each hit, Arunima may also decide to reverse the current stack of bricks, with no cost.
Find the minimum number of hits Arunima needs in order to break all bricks if she performs the reversals optimally. 
You are not required to minimize the number of reversals.
 */
import java.util.*;
public class BricksBreaking {
          public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("enter testcase");
              int t=sc.nextInt();
              int arr[]=new int[t];             
              for(int i=0;i<t;i++){
                  int s=sc.nextInt();
                  int w1=sc.nextInt();
                  int w2=sc.nextInt();
                  int w3=sc.nextInt();
                  if(w1+w2+w3<=s){
                      arr[i]=1;
                  }
                  else if(w1+w2<=s){
                     arr[i]=2;
                  }
                  else if(w2+w3<=s){
                       arr[i]=2;
                  }
                  else{
                      arr[i]=3;
                  }
              }
              for(int i=0;i<t;i++){
                  System.out.println(arr[i]);
              }
                          
}
}
