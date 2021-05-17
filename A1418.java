import java.io.IOException;
import java.util.Scanner;

public class A1418 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            long x= scan.nextLong();
            long y= scan.nextLong();
            long k= scan.nextLong();

            long ans = k + ((y*k +k+ x-3)/(x-1));
            System.out.println(ans);
        }
    }
}
