import java.io.*;
import java.util.*;

public class C1167 {
    static Stack<Integer> getIndex = new Stack<>();
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            String[] s2 = br.readLine().split(" ");
            int x = Integer.parseInt(s2[0]);
            for (int j = 1; j < x; j++) {
                int y = Integer.parseInt(s2[j]);
                int z = Integer.parseInt(s2[j + 1]);
                graph.get(z).add(y);
                graph.get(y).add(z);
            }
        }
        // System.out.println(graph);

        // solution starts here :-

        int[] vis = new int[n + 1];
        int[] ans = new int[n + 1];
        Arrays.fill(vis, -1);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (vis[i] == -1) {
                count = 0;
                // int[] newStep = new int[n + 1];
                group(graph, vis, i);
                for (int x : getIndex) {
                    ans[x] = count;
                }
                getIndex.clear();
            }
        }
        for (int i = 1; i <= n; i++)
            sb.append(ans[i] + " ");
        System.out.println(sb);
        br.close();
    }

    public static void group(List<List<Integer>> graph, int[] vis, int x) {
        vis[x] = 1;
        getIndex.add(x);
        // System.out.println(getIndex);
        count++;
        for (int y : graph.get(x)) {
            if (vis[y] == -1)
                group(graph, vis, y);
        }
        return;
    }
}