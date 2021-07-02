import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1515 {
    public static class pair implements Comparable<pair> {
        int tower, height;

        pair(int x, int y) {
            tower = x;
            height = y;
        }

        @Override
        public int compareTo(pair o) {
            return height - o.height;
        }
    }

    public static class cell implements Comparable<cell> {
        int index, num;

        cell(int x, int y) {
            index = x;
            num = y;
        }

        @Override
        public int compareTo(cell o) {
            return o.num - num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            int x = Integer.parseInt(s1[2]);
            Integer[] a = new Integer[n];
            String[] s2 = br.readLine().split(" ");

            Queue<cell> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                pq.add(new cell(i, Integer.parseInt(s2[i])));
            }

            Queue<pair> tower = new PriorityQueue<>();
            for (int i = 1; i <= m; i++)
                tower.add(new pair(i, 0));

            while (!pq.isEmpty()) {
                cell c = pq.poll();
                pair p = tower.poll();
                tower.add(new pair(p.tower, p.height + c.num));
                a[c.index] = p.tower;
            }
            sb.append("YES\n");
            for (int i = 0; i < n; i++) {
                sb.append(a[i] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
