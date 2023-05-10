//Day 84
/*Given an undirected graph and an integer M. The task is to determine if the graph can be colored with at most M colors 
such that no two adjacent vertices of the graph are colored with the same color. Here coloring of a graph means the assignment of colors to all vertices.
Print 1 if it is possible to colour vertices and 0 otherwise.*/
import java.util.*;
public class ColorUndirectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of vertices
        int m = sc.nextInt(); // number of colors
        int e = sc.nextInt(); // number of edges
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int[] colors = new int[n];
        Arrays.fill(colors, -1);

        if (colorGraph(graph, colors, 0, m)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
    private static boolean colorGraph(List<List<Integer>> graph, int[] colors, int vertex, int m) {
        if (vertex == colors.length) {
            return true;
        }
        for (int c = 0; c < m; c++) {
            boolean isSafe = true;
            for (int neighbor : graph.get(vertex)) {
                if (colors[neighbor] == c) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe) {
                colors[vertex] = c;
                if (colorGraph(graph, colors, vertex + 1, m)) {
                    return true;
                }
                colors[vertex] = -1;
            }
        }
        return false;
    }
}
