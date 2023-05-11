//Day 85
/*Determine the number of beautiful paths in the graph. Since the answer can be very large, compute it modulo (10^9)+7.*/
import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 1000000007;

    static int n, m, L;
    static int[] u, v;
    static char[] label, s;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] parts = br.readLine().trim().split("\\s+");
            n = Integer.parseInt(parts[0]);
            m = Integer.parseInt(parts[1]);
            L = Integer.parseInt(parts[2]);

            s = br.readLine().trim().toCharArray();
            label = br.readLine().trim().toCharArray();
            u = new int[m];
            v = new int[m];
            parts = br.readLine().trim().split("\\s+");
            for (int i = 0; i < m; i++) {
                u[i] = Integer.parseInt(parts[i]) - 1;
            }
            parts = br.readLine().trim().split("\\s+");
            for (int i = 0; i < m; i++) {
                v[i] = Integer.parseInt(parts[i]) - 1;
            }

            long[][] dp = new long[L][n];
            for (int j = 0; j < n; j++) {
                if (label[j] == s[0]) {
                    dp[0][j] = 1;
                }
            }
            for (int i = 1; i < L; i++) {
                for (int j = 0; j < n; j++) {
                    if (label[j] != s[i]) {
                        continue;
                    }
                    for (int k = 0; k < m; k++) {
                        if (v[k] == j && label[u[k]] == s[i-1]) {
                            dp[i][j] = (dp[i][j] + dp[i-1][u[k]]) % MOD;
                        }
                        if (u[k] == j && label[v[k]] == s[i-1]) {
                            dp[i][j] = (dp[i][j] + dp[i-1][v[k]]) % MOD;
                        }
                    }
                }
            }

            long ans = 0;
            for (int j = 0; j < n; j++) {
                ans = (ans + dp[L-1][j]) % MOD;
            }
            System.out.println(ans);
        }
    }
}
