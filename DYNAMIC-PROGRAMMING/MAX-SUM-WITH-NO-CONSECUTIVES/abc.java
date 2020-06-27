import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n==1)
        {
            System.out.println(a[0]);
            System.exit(0);
        }
        int dp[]=new int[n+1];
        dp[1]=a[0];
        dp[2]=Math.max(a[0],a[1]);
        for(int i=3;i<=n;i++)
        {
            dp[i]=Math.max(dp[i-1],a[i-1]+dp[i-2]);
        }
        System.out.println(dp[n]);
    }
}