import java.util.Scanner;

public class C1400 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int t= obj.nextInt();
        while (t-->0){
            String str= obj.next();
            int x= obj.nextInt();
            char[] a = new char[str.length()];
            char[] b = new char[str.length()];
            for (int i=0;i<str.length();i++){
                char ch='1';
                if (i-x>=0){
                    if (str.charAt(i-x)=='0')
                        ch= '0';
                }
                if (i+x< str.length()){
                    if (str.charAt(i+x)=='0')
                        ch= '0';
                }
                a[i] =ch;
//                System.out.println("*");
            }
            for (int i=0;i<str.length();i++){
                char ch='0';
                if (i-x>=0){
                    if (a[i-x] =='1')
                        ch= '1';
                }
                if (i+x< str.length()){
                    if (a[i+x] =='1')
                        ch= '1';
                }
                b[i] =ch;
//                System.out.println("**");
            }
            boolean ans= false;
            for (int i=0;i<str.length();i++){
//                System.out.println("***");
                if (str.charAt(i) != b[i]){
                    ans= true;
                    break;
                }
            }
            if (ans)
                System.out.print("-1");
            else {
                for (int i=0;i<str.length();i++){
                    System.out.print(a[i]);
                }
//                System.out.println("****");
            }
            System.out.println();
        }
    }
}
