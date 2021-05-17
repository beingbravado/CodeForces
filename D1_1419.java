import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D1_1419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] a= new int[n];
        String[] s= br.readLine().split(" ");
        for (int i=0;i<n;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int[] b= new int[n];
        int k=n-1;
        int i;
        for (i=0;i<n;i+=2){
            b[i]= a[k];
            k--;
        }
        if (i==n-1){
            i--;
        } else {
            i++;
        }
        for (;i<n;i+=2){
            b[i]= a[k];
            k--;
        }
        int ans=0;
        for (i=1;i<n;i+=2){
            if (i<n-1){
                if (b[i]<b[i-1] && b[i]<b[i+1]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        for (i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
