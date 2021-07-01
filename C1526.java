import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] a = new Integer[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        // solution starts here :-

        Queue<Integer> q = new PriorityQueue<>();
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            q.add(a[i]);
            sum += a[i];
            if (sum < 0) {
                sum -= q.poll();
            }
        }
        System.out.println(q.size());
    }
}
