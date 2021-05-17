import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class B1406 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int[] a= new int[n];
            int c0=0;
            for (int i=0;i<n;i++){
                a[i]= scan.nextInt();
                if (a[i]==0){
                    c0++;
                }
            }
            Arrays.sort(a);
            if (n-c0<5){
                System.out.println(0);
            } else {
                long ans=1;
                int cN=0,cP=0;
                for (int i=0;i<n;i++){
                    if (a[i]<0) {
                        cN++;
                    }
                    else if (a[i]>0)
                    {
                        cP++;
                    }
                }
                int x=0;
                if (cP==0){
                    for (int i=n-1;x<5;i--)
                    {
                            ans*=a[i];
                            x++;
                    }

                }
                else
                {
                    int cR=0;
                    if (cP>4){
                        cR=5;
                    }
                    else {
                        if (cP%2==1)
                            cR=cP%5;
                        else {
                            if (cP>0)
                                cR=(cP-1)%5;
                        }
                    }
                    int cL= 5-cR;
                    for (int i=0;i<cR;i++)
                        ans*=a[n-1-i];
                    for (int i=0;i<cL;i++)
                        ans*=a[i];
                }
                System.out.println(ans);
            }
        }
    }
}
