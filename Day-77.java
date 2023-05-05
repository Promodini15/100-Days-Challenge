//Day 77
/*You are given an array A of N elements. For any ordered triplet (i,j,k) such that i, j, 
and k are pairwise distinct and 1≤i,j,k≤N, the value of this triplet is (Ai?−Aj?)⋅Ak?. 
You need to find the maximum value among all possible ordered triplets*/
import java.util.*;
public class MaximumTriplet {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t -->0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        Arrays.sort(arr);
        int num=((arr[n-1]-arr[0])*arr[n-2]);
            System.out.println(num);     
        
        }
    } 
}
