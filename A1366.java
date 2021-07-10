import java.util.Scanner;

public class A1366 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long a = scan.nextInt();
            long b = scan.nextInt();
            long ans = (a + b) / 3;
            System.out.println(Math.min(ans, Math.min(a, b)));
        }
        scan.close();
    }
}
