import java.util.*;
class abc
{
    static int res=0;
    static void backtrack(int i,int n,boolean[] vis)
    {
        if(i==n+1)
        {
            res++;
            return;
        }
        for(int j=1;j<=n;j++)
        {
            if(!vis[j] && (i%j==0 || j%i==0))
            {
                vis[j]=true;
                backtrack(i+1, n, vis);
                vis[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        backtrack(1, n, new boolean[n+1]);
        System.out.println(res);
        sc.close();
    }
}