import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class C1133 {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        int t = scan.nextInt();
//        while (t-->0)
        {
            int n= Integer.parseInt(br.readLine());
            int[] a= new int[n];
            String[] s= br.readLine().split(" ");
            for (int i=0;i<n;i++){
                a[i]= Integer.parseInt(s[i]);
            }
            Arrays.sort(a);
            int ans=0; int j=0;
            for (int i = 0; i < a.length; ++i) {
                while (j < n && a[j] - a[i] <= 5) {
                    ++j;
                    ans = Math.max(ans, j - i);
                }
            }
            System.out.println(ans);
        }
    }
}
