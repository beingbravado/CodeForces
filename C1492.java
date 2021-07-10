import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class C1492 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[] a = scan.next().toCharArray();
        char[] b = scan.next().toCharArray();
        int index1 = 0, i = 0;
        while (index1 < m) {
            if (b[index1] == a[i]) {
                q.add(i);
                index1++;
            }
            i++;
        }
        int index2 = m - 1, j = n - 1;
        while (index2 >= 0) {
            if (b[index2] == a[j]) {
                s.add(j);
                index2--;
            }
            j--;
        }

        s.pop();
        int ans = 1;
        while (!s.isEmpty() && !q.isEmpty()) {
            ans = Math.max(ans, Math.abs(q.poll() - s.pop()));
        }
        System.out.println(ans);
        scan.close();
    }
}
