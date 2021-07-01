import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class B1169 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        HashSet<Integer> node = new HashSet<>();
        for (int i = 0; i <= n; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            String[] s2 = br.readLine().split(" ");
            int x = Integer.parseInt(s2[0]);
            int y = Integer.parseInt(s2[1]);
            graph.get(x).add(y);
            graph.get(y).add(x);
            // System.out.println(x + " " + y);
            // System.out.println(y + " " + x);
            node.add(x);
            node.add(y);
        }
        int totalEdges = 0;
        for (int i = 1; i <= n; i++)
            totalEdges += graph.get(i).size();
        totalEdges /= 2;
        // System.out.println(totalEdges);
        // Solution starts :-
        boolean ans = false;
        for (int i : node) {
            for (int j : node) {
                if (i != j) {
                    // System.out.println(i + " " + j);
                    int common = 0;
                    for (int k : graph.get(i))
                        if (k == j)
                            common++;
                    if (graph.get(i).size() + graph.get(j).size() - common == totalEdges) {
                        ans = true;
                    }
                    if (ans)
                        break;
                }
            }
            if (ans)
                break;
        }
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
