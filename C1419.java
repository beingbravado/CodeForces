import java.io.IOException;
import java.util.Scanner;

public class C1419 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int x= scan.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
            }
            boolean all = true;
            boolean[] b= new boolean[n];
            for (int i=0;i<n;i++){
                if (a[i]!=x){
                    all= false;
                }
                if (a[i]==x)
                    b[i]= false;
                else
                    b[i]= true;
            }
            if (all){
                System.out.println(0);
            } else {
                int sum=0,k=0,dif=0;
                for (int i=0;i<n;i++){
                    if (b[i]) {
                        sum+=a[i];
                        k++;
                        dif+= (x-a[i]);
                    }
                }
                if (dif==0)
                    System.out.println(1);
                else{
                    int ans=1;
                    if (dif>0){
                        ans+=dif/4000;
                    } else {
                        dif= Math.abs(dif);
                        ans+=dif/4000;
                    }
                    System.out.println(ans+1);
                }
            }
        }
    }
}
