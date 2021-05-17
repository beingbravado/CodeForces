import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C1131 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a= new int[n];
        int[] b= new int[n];
        for (int i=0;i<n;i++){
            a[i]= Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int start=0, end=n-1;
        for (int i=0;i<n;i++){
            if (i%2==0){
                b[start]=a[i];
                start++;
            } else {
                b[end]=a[i];
                end--;
            }
        }

        for (int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        br.close();
    }
}
