import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s1 = br.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            long[] a = new long[n];
            String[] s2 = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(s2[i]);
            }

            long x = a[0];

            for (int i = 1; i < n; i++) {
                x = x ^ a[i];
            }

            if (x == 0)
                System.out.println("YES");
            else {
                long y = 0L;
                boolean ans = false;
                con: for (int i = 0; i < n; i++) {
                    y = y ^ a[i];
                    if (y == x) {
                        long z = 0;
                        for (int j = i + 1; j < n; j++) {
                            z = z ^ a[j];
                            if (y == z) {
                                long w = 0;
                                for (int k = j + 1; k < n; k++) {
                                    w = w ^ a[k];
                                }
                                if (w == x) {
                                    ans = true;
                                    continue con;
                                }
                            }
                        }
                    }
                }

                System.out.println(ans ? "YES" : "NO");
            }

            // System.out.println(ans);
        }
    }
}
