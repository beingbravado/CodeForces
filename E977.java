import java.io.*;
import java.util.*;

public class E977 {
    static boolean flag;
    static boolean con;

    // static class relation {
    // int parent, child;

    // public relation(int x, int y) {
    // parent = x;
    // child = y;
    // }
    // }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        List<List<Integer>> graph = new ArrayList<>();
        for (int x = 0; x <= n; x++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 1; i <= m; i++) {
            String[] s2 = br.readLine().split(" ");
            int x = Integer.parseInt(s2[0]);
            int y = Integer.parseInt(s2[1]);
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        // Solution starts :-

        boolean[] visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                flag = false;
                con = true;
                isCycle(graph, visited, i, i, 0);
                if (flag && con)
                    count++;
                // System.out.println(count);
            }
        }
        System.out.println(count);
    }

    public static void isCycle(List<List<Integer>> graph, boolean[] visited, int node, int start, int length) {
        if ((node == start) && visited[node] && flag && length >= 3) {
            con = false;
            // System.out.println(start + " rejected");
            return;
        }
        if ((node == start) && visited[node] && length >= 3) {
            flag = true;
            // System.out.println(start + " accepted");
            return;
        }
        if (visited[node])
            return;
        visited[node] = true;
        // System.out.println(node);

        int count = 0;
        for (int x : graph.get(node)) {
            isCycle(graph, visited, x, start, length + 1);
            count++;
            if (count > 2) {
                con = false;
            }
        }
    }
}
