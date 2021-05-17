import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        {
            int n= Integer.parseInt(br.readLine());
            String s= br.readLine();
            int[] a= new int[n];
            int x=0,y=0;
            for (int i=0;i<s.length();i++){
                if (s.charAt(i)=='D') {
                    a[i]=1;
                    x++;
                }
                else if (s.charAt(i)=='R') {
                    a[i]=-1;
                    y++;
                }
            }

            int dCount=0, rCount=0;
            for (int z=0;z<n;z++){
                for (int i=0;i<n;i++){
                    if (a[i]==1){
                        if (rCount>0){
                            a[i]=0;
                            rCount--;
                            x--;
                        } else {
                            dCount++;
                        }
                    }
                    else if (a[i]==-1){
                        if (dCount>0){
                            a[i]=0;
                            dCount--;
                            y--;
                        } else {
                            rCount++;
                        }
                    }
                }

                if (x==0 || y==0)
                    break;
            }

            char ans='O';
            for (int i=0;i<n;i++){
                if (a[i]==1){
                    ans='D';
                    break;
                } else if (a[i]==-1){
                    ans='R';
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
