//Day 57
//Pass or fail
import java.util.*;
public class PassorFail {
  static void check(int[]a,int n){
          int correct=0,wrong=0,mark=0;
        wrong=((a[0]-a[1])*-1);
            correct=a[1]*3;
            mark=correct+wrong;
            if(mark>=a[n-1]){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }   }  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of testcases");
        int t=sc.nextInt();
        int[] arr1=new int[t];
         int[] arr2=new int[t];
          int[] arr3=new int[t];
        System.out.println("Enter N,X,P");
            for(int j=0;j<t;j++){
            arr1[j]=sc.nextInt();
            }
            for(int j=0;j<t;j++){
            arr2[j]=sc.nextInt();
            }
            for(int j=0;j<t;j++){
            arr3[j]=sc.nextInt();
        
        }
            check(arr1,t);
            check(arr2,t);
            check(arr3,t);
    }   }


