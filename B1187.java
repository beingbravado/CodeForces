import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B1187 {
    public static void main(String[] args) throws IOException {
        Scanner s= new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String str= br.readLine();
        int m=Integer.parseInt(br.readLine());
        while (m-->0){
            String st= br.readLine();
            boolean[] cond = new boolean[n];
            for (int i=0;i<n;i++){
                cond[i]= true;
            }
            int num= 0;
            for (int i=0;i<st.length();i++){
                char c= st.charAt(i);
                for (int j=0;j<n;j++){
                    if (str.charAt(j)==c){
                        if (cond[j]){
                            cond[j]= false;
                            num= Math.max(num,j+1);
                            break;
                        }
                    }
                }
            }
            System.out.println(num);
        }
        br.close();
    }
}
