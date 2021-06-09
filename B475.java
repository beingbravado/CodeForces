import java.io.*;
import java.util.*;

public class B475 {
    public static class pair {
        int x, y;

        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int m = Integer.parseInt(s1[0]);
        int n = Integer.parseInt(s1[1]);
        char[] horizontal = br.readLine().toCharArray();
        char[] vertical = br.readLine().toCharArray();
        // Solution starts :-

        boolean ans = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!route(horizontal, vertical, i, j)) {
                    ans = false;
                    break;
                }
            }
            if (!ans)
                break;
        }
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean route(char[] horizontal, char[] vertical, int x, int y) {
        int m = horizontal.length;
        int n = vertical.length;
        boolean[][] visited = new boolean[m][n];
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(x, y));
        int count = 0;
        while (!q.isEmpty()) {
            pair p = q.poll();
            if (p.x < 0 || p.y < 0 || p.x >= m || p.y >= n)
                continue;
            if (visited[p.x][p.y])
                continue;
            count++;
            visited[p.x][p.y] = true;

            if (horizontal[p.x] == '>') {
                q.add(new pair(p.x, p.y + 1));
            } else if (horizontal[p.x] == '<') {
                q.add(new pair(p.x, p.y - 1));
            }
            if (vertical[p.y] == 'v') {
                q.add(new pair(p.x + 1, p.y));
            } else if (vertical[p.y] == '^') {
                q.add(new pair(p.x - 1, p.y));
            }

        }
        // System.out.println(count);
        if (count == m * n)
            return true;
        return false;
    }
}
