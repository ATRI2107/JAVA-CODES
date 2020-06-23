import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n,w;
        Scanner sc=new Scanner(System.in);
        w=sc.nextInt();
        n=sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];
        for(int i=0;i<n;i++)
        {
            wt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            val[i]=sc.nextInt();
        }
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<=w;i++)
        {
            dp[0][i]=0;
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(wt[i-1]>j)
                dp[i][j]=dp[i-1][j];
                else
                dp[i][j]=Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
            }
        }
        System.out.println(dp[n][w]);
        sc.close();
    }
}