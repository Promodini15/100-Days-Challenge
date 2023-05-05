//Day 76
/*You are given N integers. In each step you can choose some K of the remaining numbers and delete them,
if the following condition holds: Let the K numbers you've chosen be a1, a2, a3, ..., aK in sorted order. 
Then, for each i ≤ K - 1, ai+1 must be greater than or equal to ai * C.
You are asked to calculate the maximum number of steps you can possibly make.
*/
import java.util.*;
public class MaximumSteps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
           
                for (int j = 0; j < k; j++) {
                    if (j < k - 1 && arr[j+1] >= arr[j] * c) {
                        count++;
                    }
                }
                for (int j1 = k; j1 < n - 1; j1++) {
                    if (arr[j1+1] >= arr[j1] * c) {
                        count++;
                    }
                }
            
            System.out.println(count);
        }
    }
}
