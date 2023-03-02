//Day 64
/*
If the string contains the substring "010" or "101", then the feedback is Good, else it is Bad. Note that, 
to be Good it is not necessary to have both of them as substring.
*/
import java.util.*;
public class AmitFeedback {
     public static void main(String args[]){
              Scanner sc=new Scanner(System.in);
              System.out.println("Testcase:");
              int t=sc.nextInt();      
              while(t!=0){
                  String str=sc.next();
                  int l=str.length();
                  char[] k=str.toCharArray();
                  for(int j=0;j<l;j++){
                  if(k[j]=='0'&& k[j+1]=='1' && k[j+2]=='0'){
                      System.out.println("Good");  
                      break;
                  }
                  else if(k[j]=='1' && k[j+1]=='0' && k[j+2]=='1'){
                      System.out.println("Good"); 
                      break;
                  }
                  else{
                      System.out.println("Bad");
                      break;

                  }  
              } 
                  t--;
              }
}
}
