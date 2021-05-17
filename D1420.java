import java.io.*;
import java.util.*;

public class D1420 {
    private static final long MOD=998244353;
    private static long fact[];
    private static void setFact(){
        fact= new long[(int)3e5+10];
        fact[0]=1;
        for (int i=1;i<fact.length;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }
    }
    private static long nCr(int n,int r){
        long num= (fact[n])/((fact[r]*fact[n-r])%MOD);
        return num;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
//        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n = scan.nextInt();
        int k = scan.nextInt();
        HashMap<Integer, Integer> fact = new HashMap<>();
        Integer[] a = new Integer[2 * n];
        for (int i = 0; i < 2 * n; i += 2) {
            a[i] = (2 * scan.nextInt());
            a[i + 1] = 1 + 2 * scan.nextInt();
        }
        Arrays.sort(a);
        long ans = 0L;
        int on = 0;

        for (int i = 0; i < 2 * n; i++) {
//            System.out.println("    "+a[i]);
            if (a[i] % 2 == 1) {
                on--;
            } else {
                on++;
//                System.out.println("        "+on);
                if (on >= k) {
                    long z = nCr(on - 1, k - 1);
                    ans += z;
//                    System.out.println(z);
//                    System.out.println(ans);
                }
            }
        }
        ans = ans%MOD;

        System.out.println(ans);
    }
}

//// written and directed by gullu ki aunty
//import java.io.*;
//import java.util.*;
//public class D
//{
//    private static final long MOD=998244353;
//    private static long[] fact;
//    private static void calcFact()
//    {
//        fact=new long[(int)3e5+10];
//        fact[0]=1;
//
//        for(int i=1;i<fact.length;i++)
//            fact[i]=(fact[i-1]*i)%MOD;
//    }
//    private static long pow(long a, long b)
//    {
//        a%=MOD;
//        b%=(MOD-1);//if MOD is prime
//        long res=1;
//        while (b>0)
//        {
//            if((b&1)==1)
//                res=(res*a)%MOD;
//            a=(a*a)%MOD;
//            b>>=1;
//        }
//        return res%MOD;
//    }
//    private static long inv(long a){return pow(a,MOD-2)%MOD;}
//    private static long NCr(int N, int K)
//    {
//        if(K>N) return 0;
//        long num=fact[N];
//        long denom = (fact[K]*fact[N-K])%MOD;
//        return num*inv(denom)%MOD;
//    }
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//        int i,N;
//        String[] s=br.readLine().trim().split(" ");
//        N=Integer.parseInt(s[0]);
//        int K=Integer.parseInt(s[1]);
//
//        calcFact();
//        ArrayList<Integer> list=new ArrayList<>();
//        for(i=0;i<N;i++)
//        {
//            s=br.readLine().trim().split(" ");
//            int l=Integer.parseInt(s[0]);
//            int r=Integer.parseInt(s[1]);
//
//            list.add(2*l);
//            list.add(2*r+1);
//        }
//        Collections.sort(list);
//
//        long ans=0; int c=0;
//        for(i=0;i<list.size();i++)
//        {
//            if(list.get(i)%2==1) c--;
//            else
//            {
//                c++;
//                ans=(ans+NCr(c-1,K-1))%MOD;
//            }
//        }
//        System.out.println(ans);
//    }
//}