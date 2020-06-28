import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<=sum;i++)
        {
            dp[0][i]=false;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                dp[i][j]=dp[i-1][j];
                if(a[i-1]<=j)
                dp[i][j]=dp[i][j] || dp[i-1][j-a[i-1]];
            }
        }
        int diff=Integer.MAX_VALUE;
        for(int j=sum/2;j>=0;j--)
        {
            if(dp[n][j])
            {
                diff=sum-2*j;
                break;
            }
        }
        System.out.println(diff);
    }
}