import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int n= Integer.parseInt(br.readLine());
        int[] stair= new int[n];
        String[] s= br.readLine().split(" ");
        for (int i=0;i<n;i++){
            stair[i]= Integer.parseInt(s[i]);
        }
        int m= Integer.parseInt(br.readLine());
        int[] width= new int[m+1];
        int[] height= new int[m+1];
        width[0]=0; height[0]=0;
        for (int i=1;i<=m;i++){
            String[] sq= br.readLine().split(" ");
            width[i]= Integer.parseInt(sq[0]);
            height[i]= Integer.parseInt(sq[1]);
        }

        int lastHeight= 0;
        for (int i=1;i<=m;i++){
            lastHeight= Math.max(lastHeight+height[i-1],stair[width[i]]);
            sb.append(lastHeight+"\n");
        }
        System.out.print(sb);
    }
}
