import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n,a,b,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            dp[i]=-1;
            if(i-a>=0) dp[i]=Math.max(dp[i],dp[i-a]);
            if(i-b>=0) dp[i]=Math.max(dp[i],dp[i-b]);
            if(i-c>=0) dp[i]=Math.max(dp[i],dp[i-c]);
            if(dp[i]!=-1) dp[i]++;
        }
        System.out.println(dp[n]);
    }
}