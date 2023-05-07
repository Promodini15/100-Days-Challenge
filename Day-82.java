//Day 82
/*For each test case, print on one line a binary string of length N, which is different from all of the given strings.
If there are multiple possible answers, print any.*/
import java.util.*;
public class DifferentBinaryString {
      public static void main(String args[]){     
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){           
            int n=sc.nextInt(); 
            String ans="";
            for(int j=0;j<n;j++){
            String s=sc.next();
            if(s.charAt(j)=='0'){
                ans+='1';
            }
            else{
                 ans+='0';
            }
              
            }
              System.out.println(ans);
}
      }
}
