import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1265 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            int n= Integer.parseInt(br.readLine());
            int[] a = new int[n];
            String str = br.readLine();
            String[] s = str.split(" ");
            for (int i=0;i<n;i++){
                a[i]= Integer.parseInt(s[i]);
            }
            int l,r,count=1;
            for (int i=0;i<n;i++){

            }
        }
        br.close();
    }
}
