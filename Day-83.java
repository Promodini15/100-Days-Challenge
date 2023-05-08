//Day 83
/*Given a complete binary tree with the height of H, we index the nodes respectively top-down and left-right from 1. The i-th node stores a positive integer Vi.
Define Pi as follows: Pi=Vi if the i-th node is a leaf, otherwise Pi=max(Vi*PL, Vi*PR), where L and R are the indices of the left and right children of i, respectively. 
Your task is to caculate the value of P1.*/
import java.util.*;
import java.io.*;
public class BinaryTree {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            int H = Integer.parseInt(line);
            if (H == 0) {
                break;
            }
            int[] tree = Arrays.stream(br.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int P1 = calculateP1(tree, 1);
            System.out.println(P1);
        }
    }
    private static int calculateP1(int[] tree, int i) {
        if (i > tree.length) {
            return 0;
        }
        if (2 * i > tree.length) {
            return tree[i-1];
        }
        int L = 2 * i;
        int R = 2 * i + 1;
        int PL = calculateP1(tree, L);
        int PR = calculateP1(tree, R);
        int Vi = tree[i-1];
        return Math.max(Vi*PL, Vi*PR) % MOD;
    }
}
