//Day 79
/*Find the minimum number of operations required to convert all the characters of S to 0.*/
import java.util.*;
public class BinaryString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt();
        String s=sc.next();
        int count=0,c=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                count++;
                if(s.charAt(i)==s.charAt(i+1)){
                    c++;
                }                
            }
        }
            if(count==0){
                System.out.println("0");
            }
            else
            {
                if(c==0)
                {
                    System.out.println("1");
                }
                else{
                    System.out.println("2");
                }                       
            }        
        }             
    }
}
