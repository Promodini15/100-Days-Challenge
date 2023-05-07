//Day 80
/*Find out whether it is possible that Alice and Bob end up with exactly same multiset of animals.*/
import java.util.*;
public class AliceAndBob {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){           
            int n=sc.nextInt();          
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }            
           Map<Integer,Integer> freq= new HashMap<>();
            for(int num:arr){
                freq.put(num, freq.getOrDefault(num,0)+1);
            }
            int count = 0;            
for(int value : freq.values()) {
    if(value%2==0){
        count++;
    }
}
              if((count>1)&&(count%2==0)){
              System.out.println("Yes");
          }
          else{
              System.out.println("no");
          }
            }
} 
        }

    
    

