import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A1397 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan= new Scanner(System.in);
        int t = Integer.parseInt(br.readLine());
//        int t= scan.nextInt();
        while (t-->0){
            int n= Integer.parseInt(br.readLine());
//            int n= scan.nextInt();
            int sum=0;
            int[] a= new int[26];
            for (int i=0;i<n;i++){
                String s= br.readLine();
//                String s= scan.next();
                int l=s.length();
                for (int j=0;j<26;j++){
                    int k= (int)(s.charAt(i)-'a');
                    a[k]++;
                }
            }
            boolean ans= true;
            for (int i=0;i<26;i++){
                if (a[i]%n!=0){
                    ans=false;
                    break;
                }
            }
            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        br.close();
    }
}
