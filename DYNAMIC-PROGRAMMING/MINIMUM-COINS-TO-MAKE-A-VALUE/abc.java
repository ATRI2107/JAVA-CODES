import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int dp[]=new int[val+1];
        dp[0]=0;
        for(int i=1;i<=val;i++)
        {
            dp[i]=Integer.MAX_VALUE;
            for(int j:coins)
            {
                if(j<=i)
                {
                    int sub_res=dp[i-j];
                    if(sub_res!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],sub_res+1);
                }
            }
        }
        System.out.println(dp[val]);
    }
}