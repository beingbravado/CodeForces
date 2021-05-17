import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A287 {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        {
            int[][] a= new int[4][4];
            for (int i=0;i<4;i++){
                String s= br.readLine();
                for (int j=0;j<4;j++){
                    if (s.charAt(i)=='#')
                        a[i][j]=0;
                    else
                        a[i][j]=1;
                }
            }
            boolean ans= true;
            for (int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    int c0=0,c1=0;
                    for (int x=i;x<i+2;x++){
                        for (int y=j;y<j+2;y++){
                            if (a[x][y]==0)
                                c0++;
                            else
                                c1++;
                        }
                    }
                    System.out.println(c0+" "+c1);
                    if (c1>=3 || c0>=3){
                        System.out.println("YES");
                        ans= false;
                        break;
                    }
                }
                if (!ans)
                    break;
            }
            if (ans)
                System.out.println("NO");
        }
    }
}
