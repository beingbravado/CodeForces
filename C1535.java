import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s1 = br.readLine().split(" ");
        int t = Integer.parseInt(s1[0]);
        while (t-- > 0) {
            char[] s = br.readLine().trim().toCharArray();
            long ans = 0;
            int last = 0, count = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i] != '?') {
                    if ((i - last) % 2 == 0) {
                        if (s[i] != s[last] && s[last] != '?')
                            count = i - last - 1;
                    } else {
                        if (s[i] == s[last] && s[last] != '?')
                            count = i - last - 1;
                    }
                    last = i;
                }
                ans += ++count;
                System.out.print(ans + " ");
            }
            System.out.println(ans);
            sb.append(ans + "\n");
        }
        System.out.println(sb);
    }
}
