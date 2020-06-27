import java.util.*;
class abc
{
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        int m=s1.length(),n=s2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<=n;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int i=m,j=n;
        String lcs="";
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                lcs=s1.charAt(i-1)+lcs;
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1])
            i--;
            else
            j--;
        }
        System.out.println(dp[m][n]);
        System.out.println(lcs);
        sc.close();
    }
}