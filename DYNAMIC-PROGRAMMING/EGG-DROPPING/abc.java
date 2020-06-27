import java.util.*;
class abc
{
    public static void main(String[] args) {
        int f,e;
        Scanner sc=new Scanner(System.in);
        f=sc.nextInt();
        e=sc.nextInt();
        int dp[][]=new int[f+1][e+1];
        for(int i=1;i<=e;i++)
        {
            dp[0][i]=0;
            dp[1][i]=1;
        }
        for(int i=2;i<=f;i++)
        {
            dp[i][1]=i;
        }
        for(int i=2;i<=f;i++)
        {
            for(int j=2;j<=e;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
                for(int x=1;x<=i;x++)
                {
                    dp[i][j]=Math.min(dp[i][j],1+Math.max(dp[x-1][j-1],dp[i-x][j]));
                }
            }
        }
        System.out.println(dp[f][e]);
    }
}