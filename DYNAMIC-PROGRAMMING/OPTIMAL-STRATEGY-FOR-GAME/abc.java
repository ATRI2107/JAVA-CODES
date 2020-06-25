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
        int dp[][]=new int[n][n];
        for(int i=0;i<n-1;i++)
        {
            dp[i][i+1]=Math.max(a[i],a[i+1]);
        }
        for(int gap=3;gap<n;gap+=2)
        {
            for(int i=0;i+gap<n;i++)
            {
                int j=i+gap;
                dp[i][j]=Math.max(a[i]+Math.min(dp[i+2][j],dp[i+1][j-1]),a[j]+Math.min(dp[i+1][j-1],dp[i][j-2]));
            }
        }
        System.out.println(dp[0][n-1]);
        sc.close();
    }
}