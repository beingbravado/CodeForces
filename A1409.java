import java.io.IOException;
import java.util.Scanner;

public class A1409 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int a= scan.nextInt();
            int b= scan.nextInt();
            int dif= Math.abs(a-b);
            int ans= dif/10;
            if (dif%10>0){
                ans++;
            }
            System.out.println(ans);
        }
    }
}