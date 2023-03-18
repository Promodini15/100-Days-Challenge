//Day-71
/*
There are N students in a class, where the i-th student has a score of Ai?.
The i-th student will boast if and only if the number of students scoring
less than or equal Ai? is greater than the number of students scoring greater than Ai?.
Find the number of students who will boast.
*/
import java.util.*;
public class Boast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter t");
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int num=sc.nextInt();
            int arr[]=new int[num];
            for(int j=0;j<num;j++){
               arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=num/2;
            while(count>0&&arr[count-1]==arr[count]){
                count--;
            }
            System.out.println(num-count);
        }
  
    }    
}
