import java.util.Scanner;

public class D1399 {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0) {
            int n= scan.nextInt();
            int[] a= new int[n];
            String str= scan.next();
            char ch=str.charAt(0);
            char x='0',y='1';
            int count =1;
            a[0]=1;
            int max=1;
            char last='z';
            for (int i=0;i<n;i++){
                if (i>=1){
                    if (str.charAt(i)==str.charAt(i-1) && ch!=str.charAt(i)){
                        if (last=='z') {
                            last= str.charAt(i);
                            a[i]=2;
                        }


                    }
                } else {
                    count=1;
                    a[i]=count;
                }
                max= Math.max(max,a[i]);
            }
            System.out.println(max);
            for (int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }


//    public static void main(String[] args) {
//        Scanner scan= new Scanner(System.in);
//        int t= scan.nextInt();
//        while (t-->0){
//            int n= scan.nextInt();
//            String str = scan.next();
//            int[] arr= new int[n];
//            char a='0',b='1';
//            int count=0;
//            int max=0;
//            for (int i=1;i<=n;i++){
//                boolean cond = true;
//                char ch='x';
//                for (int j=0;j<n;j++){
//                    if (cond && arr[j]==0){
//                        cond = false;
//                        ch= str.charAt(j);
//                    }
//                    if (str.charAt(j)==ch && arr[j]==0){
//                        arr[j]=i;
//                        count++;
//                        if (ch==a)
//                            ch=b;
//                        else if (ch==b)
//                            ch=a;
//                    }
//                }
//                max= Math.max(max,i);
//                if (count>=n)
//                    break;
//            }
//            System.out.println(max);
//            for (int i=0;i<n;i++){
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
//    }
}
