import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1119 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]= Integer.parseInt(str[i]);
        }
        int min=0,sum=0,k=0,totSum=0;
        for (int i=0;i<n;i+=2){
            if (i==n-1){
                sum+=a[i];
                totSum+=a[i];
                if (sum <= h+min && totSum<=2*h){
                    k++;
                }
            } else {
                sum+= Math.max(a[i],a[i+1]);
                totSum+=a[i]+a[i+1];
                int myMin = Math.max(min, Math.abs(a[i]-a[i+1]));
                if (sum <= h+min && totSum<=2*h){
                    k+=2;
                    if (sum>h && sum<=h+min)
                        break;
                } else {
                    totSum-= a[i+1];
                    sum-= Math.max(a[i],a[i+1]);
                    sum+= a[i];
                    if (sum < h+min && totSum<=2*h){
                        k++;
                    } else {
                        break;
                    }
                    if (sum>h && sum<=h+min)
                        break;
                }
                min= Math.max(min,myMin);
            }
        }
        System.out.println(k);

        br.close();
    }
}
