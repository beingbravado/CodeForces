import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C628 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String str= br.readLine();
        char[] c= str.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<n;i++) {
            if (c[i] + k <= 'z') {
                int num = (int) c[i] + k;
                c[i] = (char) num;
                k = 0;
            } else if (c[i] - k >= 'a') {
                int num = (int) c[i] - k;
                c[i] = (char) num;
                k = 0;
            } else {
                char a = 'a', z = 'z';
                if ((int) c[i] - (int) a > (int) z - (int) c[i] && k > 0) {
                    int dif = (int) c[i] - (int) a;
                    c[i] = 'a';
                    k -= dif;
                } else {
                    int dif = (int) z - (int) c[i];
                    c[i] = 'z';
                    k -= dif;
                }
            }
            ans.append(c[i]);
        }
        if (k==0)
            System.out.println(ans);
        else
            System.out.println("-1");
        br.close();
    }
}
