import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class D1539 {
    static class pair {
        long a, b;

        public pair(long x, long y) {
            a = x;
            b = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<pair> pq = new PriorityQueue<>(n, (x, y) -> x.b > y.b ? 1 : -1);
        while (n-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            long a = Integer.parseInt(s[0]);
            long b = Integer.parseInt(s[1]);
            pq.add(new pair(a, b));
        }
        Deque<pair> dq = new ArrayDeque<>();
        while (!pq.isEmpty()) {
            dq.add(pq.poll());
            System.out.println(dq.peekLast().a + " " + dq.peekLast().b);
        }
        long ans = 0;
        long bought = 0;
        while (!dq.isEmpty()) {
            if (bought >= dq.peekFirst().b) {
                bought += dq.peekFirst().a;
                ans += dq.peekFirst().a;
                dq.pollFirst();
            } else {
                if (bought + dq.peekLast().a > dq.peekFirst().b) {
                    pair p = dq.pollLast();
                    bought = dq.peekFirst().b;
                    ans += 2 * (bought - dq.peekFirst().b);
                    p.a = bought + p.a - dq.peekFirst().b;
                    dq.addLast(p);
                } else {
                    bought += dq.peekLast().a;
                    ans += 2 * dq.peekLast().a;
                    dq.pollLast();
                }
            }
        }
        System.out.println(ans);
    }
}
