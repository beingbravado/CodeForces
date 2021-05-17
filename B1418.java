import java.util.Arrays;
import java.util.Scanner;

public class B1418 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            String s = scan.next();
            int zero = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0')
                    zero++;
            }
            int[] b = new int[zero];
            int x = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    b[x] = a[i];
                    x++;
                }
            }
            Arrays.sort(b);
            x = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    a[i] = b[x];
                    x++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}


//    public static void main(String[] args) throws IOException {
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//        Scanner scan= new Scanner(System.in);
////        int t= Integer.parseInt(br.readLine());
//        int t= scan.nextInt();
//        while (t-->0) {
////            int n = Integer.parseInt(br.readLine());
//            int n= scan.nextInt();
//
////            String[] s= br.readLine().split(" ");
//            int[] a= new int[n];
//            for (int i=0;i<n;i++){
//                a[i]= scan.nextInt();
//            }
//
//            String str= scan.next();
//            int zero=0;
//            for (int i=0;i<str.length();i++){
//                if (str.charAt(i)=='0') {
//                    zero++;
//                }
//            }
//            System.out.println(zero);
//
//            int[] b= new int[zero];
//            int x=0;
//            for (int i=0;i<str.length();i++){
//                if (str.charAt(i)=='0') {
//                    b[x]=a[i];
//                    x++;
//                }
//            }
//            Arrays.sort(b);
//            x=0;
//            for (int i=0;i<str.length();i++){
//                if (str.charAt(i)=='0') {
//                    a[i]=b[x];
//                    x++;
//                }
//            }
//
//            for (int i=0;i<zero;i++)
//                System.out.print(b[i]+" ");
//            System.out.println();
//
//            for (int i=0;i<n;i++)
//                System.out.print(a[i]+" ");
//            System.out.println();
//        }
//    }