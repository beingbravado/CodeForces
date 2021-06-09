import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long min = m * 2 >= n ? 0 : n - 2 * m;
        long max = 0;
        int x=0;
        for (int i = 1; i <= 2*m; i++) {
            max += i - 1;
            if (max >= m) {
                x=i;
                break;
            }
        }
        max = n - x;
        System.out.println(min + " " + max);
        scan.close();
        ;
    }
}
