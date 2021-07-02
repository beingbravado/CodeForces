import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class C1523 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s1 = br.readLine().split(" ");
        int t = Integer.parseInt(s1[0]);
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> list = new ArrayList<>();
            while (n-- > 0) {
                int num = Integer.parseInt(br.readLine().trim());
                if (num == 1)
                    list.add(num);
                else {
                    int i = list.size();
                    while (i-- > 0) {
                        if (list.get(i) + 1 == num) {
                            list.remove(i);
                            list.add(num);
                            break;
                        } else {
                            list.remove(i);
                        }
                    }
                }
                sb.append(list.get(0));
                for (int x = 1; x < list.size(); x++)
                    sb.append("." + list.get(x));
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
