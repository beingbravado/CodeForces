import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1272 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int l=0,r=0,u=0,d=0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='L')
                    l++;
                else if (s.charAt(i)=='R')
                    r++;
                else if (s.charAt(i)=='U')
                    u++;
                else if (s.charAt(i)=='D')
                    d++;
            }
            l=Math.min(l,r);
            r=Math.min(l,r);
            u=Math.min(u,d);
            d=Math.min(u,d);
            if (l==0 && u==0)
                System.out.println(0);
            else if (l==0){
                System.out.println(2);
                System.out.print("UD");
            } else if (u==0){
                System.out.println(2);
                System.out.print("RL");
            } else {
                System.out.println(2*l+2*u);
                while (r-->0)
                    System.out.print("R");
                while (u-->0)
                    System.out.print("U");
                while (l-->0)
                    System.out.print("L");
                while (d-->0)
                    System.out.print("D");
            }
            System.out.println();
        }
        br.close();
    }
}
