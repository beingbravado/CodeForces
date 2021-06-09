import java.io.*;
import java.util.*;

public class C755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        List<List<Integer>> graph = new ArrayList<>();
        String[] s2 = br.readLine().split(" ");
        for (int x = 0; x <= n; x++) {
            graph.add(new ArrayList<>());
        }
        for (int x = 1; x <= n; x++) {
            int y = Integer.parseInt(s2[x - 1]);
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        // Solution starts :-

        boolean[] visited = new boolean[n + 1];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                family(graph, visited, i);
            }
        }
        System.out.println(count);
    }

    public static void family(List<List<Integer>> graph, boolean[] visited, int node) {
        if (visited[node])
            return;
        visited[node] = true;
        for (int x : graph.get(node))
            family(graph, visited, x);
    }
}
