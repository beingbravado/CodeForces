import java.io.*;
import java.util.*;

public class C1519 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n];
            String[] s1 = br.readLine().split(" ");
            String[] s2 = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s1[i]);
                b[i] = Integer.parseInt(s2[i]);
            }

            Map<Integer, List<Long>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                List<Long> list = map.get(a[i]);
                if (list == null)
                    list = new ArrayList<>();
                list.add((long) b[i]);
                map.put(a[i], list);
            }

            for (int hm : map.keySet()) {
                List<Long> v = map.get(hm);
                Collections.sort(v, Comparator.reverseOrder());
                // System.out.println(v);
                ArrayList<Long> dp = new ArrayList<>();
                for (int x = 0; x < v.size(); x++)
                    dp.add(v.get(x) + (x == 0 ? 0 : dp.get(x - 1)));

                map.put(hm, dp);
                // System.out.println(dp);
            }

            long count = -1;
            for (int i = 1; i <= n; i++) {
                if (count != 0) {
                    count = 0;
                    for (int hm : map.keySet()) {
                        count += (map.get(hm).size() < i ? 0
                                : map.get(hm).get(map.get(hm).size() - (map.get(hm).size()) % i - 1));
                    }
                }
                sb.append(count + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}