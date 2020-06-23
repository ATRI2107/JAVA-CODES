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
        int dp[]=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<i;j++)
            {
                if(a[j]+j>=i)
                {
                    int sub_res=dp[j];
                    if(sub_res!=Integer.MAX_VALUE)
                    dp[i]=Math.min(dp[i],sub_res+1);
                }
            }
        }
        System.out.println(dp[n-1]);
    }
}