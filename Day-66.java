//Day-66 
/*     
Today, Anoop has two strings A and B, each consisting of lower case alphabets.
Anoop is eager to know whether it is possible to choose some non empty strings s1 and s2
where s1 is a substring of A, s2 is a substring of B such that s1 + s2 is a palindromic string.
*/
import java.util.*;
public class PalindromicSubstrings {
      public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter testcase");
      int num=sc.nextInt();
     while(num-->0){
      String str1=sc.next();
      String str2=sc.next();
      int count=0;
      for(int i=0;i<str1.length();i++){
          for(int j=0;j<str2.length();j++){
              if(str1.charAt(i)==str2.charAt(j)){
                  count=1;
                  break;
              }
          }
     
      if(count==1){
          break;
      
      }
      }    
       if(count==1){
           System.out.println("yes");
       }   
       else{
           System.out.println("no");
       }           
      }
}}
        
