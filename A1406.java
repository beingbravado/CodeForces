import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class A1406 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            Arrays.sort(a);
            int[] x= new int[n];
            int[] y= new int[n];
            for (int i=0;i<n;i++){
                x[i]=-1;
                y[i]=-1;
            }
            int l=1,r=0;
            x[0]=a[0];
            for (int i=1;i<n;i++){
                if (a[i]==a[i-1]){
                    if (r>0){
                        if (y[r-1]!=a[i]){
                            y[r]=a[i];
                            r++;
                        }
                    } else {
                        y[r]=a[i];
                        r++;
                    }
                }else{
                    x[l]=a[i];
                    l++;
                }
            }
            int sum=0;
            boolean con= true;
            for (int i=0;i<n;i++){
                if (x[i]!=i){
                    sum+=i;
                    con=false;
                    break;
                }
            }
            if (con){
                sum=n;
            }
            for (int i=0;i<n;i++){
                if (y[i]!=i){
                    sum+=i;
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
