import java.io.IOException;
import java.util.Scanner;

public class C1409 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int n= scan.nextInt();
            int a= scan.nextInt();
            int b= scan.nextInt();
            int dif= Math.abs(a-b);
            if (n==2){
                System.out.println(a+" "+b);
            } else {
                boolean cond= true;
                int no=n;
                while (--no>=2){
                    if (dif%no==0){
                        cond= false;
                        break;
                    }
                }
                int num= dif/no;
                if (cond)
                    num= dif;
                System.out.print(a+" "+b);
                n-=1;
                int m=num;
                while (b-m>0 && n>0){
                    if (b-m!=a)
                        System.out.print(" "+(b-m));
                    m+=num;
                    n--;
                }
                m=num;
                while (n>0){
                    System.out.print(" "+(b+m));
                    m+=num;
                    n--;
                }
                System.out.println();
            }
        }
    }
}
