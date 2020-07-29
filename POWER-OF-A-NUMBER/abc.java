import java.util.*;
class abc
{
    static double fast(double x,long n)
    {
        if(n==0) return 1.0;
        double half=fast(x, n/2);
        if(n%2==0) return half*half;
        else return half*half*x;
    }
    public static void main(String[] args) {
        double x;
        int n;
        Scanner sc=new Scanner(System.in);
        x=sc.nextDouble();
        n=sc.nextInt();
        long N=n;
        if(N<0)
        {
            x=1/x;
            N=-N;
        }
        System.out.println(fast(x, N));
        sc.close();
    }
}