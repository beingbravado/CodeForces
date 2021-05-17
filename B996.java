import java.util.Scanner;

public class B996 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        long[] a= new long[n];
        long[] b= new long[n];
        long[] c= new long[n];
        for (int i=0;i<n;i++){
            a[i]= scan.nextInt();
            b[i]= a[i]/n;
            c[i]= a[i]%n;
        }
        long min= Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            min= Math.min(min,b[i]);
            c[i]= c[i]-i;
        }
        boolean ans= true;
        for (int i=0;i<n;i++){
            if (c[i]<=0 && b[i]==min){
                System.out.println(i+1);
                ans= false;
                break;
            }
        }
        if (ans){
            for (int i=0;i<n;i++){
                c[i] -= n;
                if (c[i]<=0){
                    if (b[i]==min){
                        System.out.println(i+1);
                        break;
                    } else if (c[i]+n<=0 && b[i]==min+1){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }
}
