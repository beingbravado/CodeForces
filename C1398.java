import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C1398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(1, 1);
            int sum = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                sum += s[i] - '0';
                ans += map.getOrDefault(sum - i, 0);
                map.put(sum - i, map.getOrDefault(sum - i, 0) + 1);
            }
            System.out.println(ans);
        }
    }
}
