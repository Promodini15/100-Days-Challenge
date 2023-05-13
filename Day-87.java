//Day 87
/*
There are N stones in a pond, each having a value Ai? written on it. 
A frog is at stone 1 and wants to reach stone N. The frog can jump from a stone i to any stone j(j>i). 
Let d be the length of subarray (i.e. j−i+1), then the energy required for the jump is (d⋅Ai?)−Aj?. 
Find the minimum non-negative amount of energy required by the frog to reach the N-th stone.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class FrogJump {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(bu.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(bu.readLine());
            String s[] = bu.readLine().split(" ");
            int a[] = new int[n], i;
            for (i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            long ans = a[0];
            int min = a[0];
            for (i = 1; i < n; i++) {
                ans += min;
                min = Math.min(min, a[i]);
            }
            ans -= a[n - 1];
            ans = Math.max(ans, 0);
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
}
