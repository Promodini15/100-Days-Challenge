//Day 81
/*You have a binary string S of length N. In one operation you can select a substring of S and reverse it. 
For example, on reversing the substring [2,4]S[2,4] for S=11000, we change 11000→10010.
Find the minimum number of operations required to sort this binary string.
*/
import java.util.*;
public class ReverseBinaryString {
    public static void main(String args[]){     
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){           
            int n=sc.nextInt();          
            String s=sc.next();
            int count=0;
           for(int j=s.length();j>=2;j--){
               if(s.substring(j-2,j).equals("10")){
                   count++;
               }
           }
            System.out.println(count);
           
    }
}
}
