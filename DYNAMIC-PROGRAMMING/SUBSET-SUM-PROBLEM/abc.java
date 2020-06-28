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
        int sum=sc.nextInt();
        int dp[][]=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=sum;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(j>=a[i-1])
                dp[i][j]+=dp[i-1][j-a[i-1]];
            }
        }
        System.out.println(dp[n][sum]);
    }
}