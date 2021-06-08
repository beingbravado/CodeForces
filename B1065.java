import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m= scan.nextInt();
        int min= m+1>=n?0:n-m-1;
        int k= (int)Math.sqrt(2*n);
        scan.close();;
    }
}
