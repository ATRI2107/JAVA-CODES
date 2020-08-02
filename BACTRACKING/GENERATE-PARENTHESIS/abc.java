import java.util.*;
class abc
{
    static void dfs(ArrayList<String> res,int o,int c,int n,String s)
    {
        if(s.length()==2*n)
        {
            res.add(s);
            return;
        }
        if(o<n) dfs(res, o+1, c, n, s+"(");
        if(c<o) dfs(res,o,c+1,n,s+")");
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<String> res=new ArrayList<>();
        dfs(res, 0, 0, n, "");
        System.out.println(res);
        sc.close();
    }
}