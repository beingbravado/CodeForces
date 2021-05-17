import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class E1426 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = scan.nextInt();
        while (t-->0)
        {
//            int n= Integer.parseInt(br.readLine());
            int n= scan.nextInt();
//            long[] a= new long[n];
//            String[] s= br.readLine().split(" ");
//            String s= scan.next();
            int[] r= new int[2];
            int[] s= new int[2];
            int[] p= new int[2];
            r[0]= scan.nextInt();
            s[0]= scan.nextInt();
            p[0]= scan.nextInt();
            r[1]= scan.nextInt();
            s[1]= scan.nextInt();
            p[1]= scan.nextInt();
            int max=Math.min(r[0],s[1])+Math.min(s[0],p[1])+Math.min(p[0],r[1]);

            int min=0;
            if (r[0]>r[1]+p[1]){
                min+=r[0]-(r[1]+p[1]);
                r[1]=0; p[1]=0;
            }
//            else {
//                if (r[0]>r[1]){
//                    p[1]-=r[0]-r[1];
//                    r[1]=0;
//                } else {
//                    r[1]-=r[0];
//                }
//            }
            if (s[0]>s[1]+r[1]){
                min+=s[0]-(s[1]+r[1]);
                s[1]=0; r[1]=0;
            }
//            else {
//                if (s[0]>s[1]){
//                    r[1]-=s[0]-s[1];
//                    s[1]=0;
//                } else {
//                    s[1]-=s[0];
//                }
//            }
            if (p[0]>p[1]+s[1]){
                min+=p[0]-(p[1]+s[1]);
                p[1]=0; s[1]=0;
            }
//            else {
//                if (r[0]>r[1]){
//                    p[1]-=r[0]-r[1];
//                    r[1]=0;
//                } else {
//                    r[1]-=r[0];
//                }
//            }
            System.out.println(min+" "+max);
        }
    }
}
