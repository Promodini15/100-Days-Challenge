//Day 94
import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
int n = input.nextInt();
long g[][][] = new long[30][500][9];
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
if (input.nextInt() == 1)
g[0][i][j / 60] |= 1l << (j % 60);
for (int t = 1; t < 30; t++)
for (int i = 0; i < n; i++)
for (int j = 0; j < n; j++)
if ((g[t - 1][i][j / 60] & (1l << (j % 60))) != 0)
for (int k = 0; k < 9; k++)
g[t][i][k] |= g[t - 1][j][k];
int m = input.nextInt();
while ((m--) > 0) {
int len = input.nextInt(), x = input.nextInt() - 1;
long mask[] = new long[9];
mask[x / 60] = 1l << (x % 60);
for (int t = 0; t < 30; t++)
if ((len & (1l << t)) != 0) {
long newmask[] = new long[9];
for (int i = 0; i < n; i++)
if ((mask[i / 60] & (1l << (i % 60))) != 0)
for (int j = 0; j < 9; j++)
newmask[j] |= g[t][i][j];
for (int i = 0; i < 9; i++)
mask[i] = newmask[i];
}
int ans[] = new int[n];
int cnt = 0;
for (int i = 0; i < n; i++)
if ((mask[i / 60] & (1l << (i % 60))) != 0)
ans[cnt++] = i + 1;
System.out.println(cnt);
for (int i = 0; i < cnt; i++)
System.out.print(ans[i] + (i == cnt - 1 ? "\n" : " "));
if (cnt == 0)
System.out.println(-1);
}
}
