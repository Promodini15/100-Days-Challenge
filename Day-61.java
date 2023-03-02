//Day 61
/*Given the time control of a chess match as a+b, determine which format of chess out of the given 4 it belongs to.
1) Bullet if a+b<3
2) Blitz if 3≤a+b≤10
3) Rapid if 11≤a+b≤60
4) Classical if 60<a+b */
import java.util.*;
public class ChessFormat {
    public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Testcase:");
              int t=sc.nextInt();
              int arr[]=new int[t];
              for(int i=0;i<t;i++){
                      int a=sc.nextInt();
                      int b=sc.nextInt();
                      if(a+b<3){
                          arr[i]=1;
                      }
                      else if(3<=a+b && a+b<=10){
                          arr[i]=2;
                      }
                      else if( 11<=a+b && a+b<=60 ){
                          arr[i]=3;
                      }
                      else{
                  arr[i]=4;
              }
                  }
              for(int i=0;i<t;i++){
                  System.out.println(arr[i]);
              }
          
}
}
