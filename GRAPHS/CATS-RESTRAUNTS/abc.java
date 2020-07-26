import java.util.*;
public class abc
{
    int res=0;
    void dfs(int par,int s,int count,ArrayList<Integer> adj[],int cats[],int m,boolean vis[])
    {
        vis[s]=true;
        if(cats[s]==1) count++;
        else count=0;
        if(count>m) return;
        if(adj[s].size()==1 && s!=1) res++;
        for(int u:adj[s])
        {
            if(!vis[u]) dfs(s,u, count, adj, cats,m,vis);
        }
    }
    int dfsutil(ArrayList<Integer> adj[],int cats[],int m,boolean vis[])
    {
        dfs(0, 1, 0, adj, cats, m, vis);
        return res;
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int cats[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            cats[i]=sc.nextInt();
        }
        ArrayList<Integer> adj[]=new ArrayList[n+1];
        Arrays.fill(adj,new ArrayList<Integer>());
        for(int i=1;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        boolean vis[]=new boolean[n+1];
        System.out.println(new abc().dfsutil(adj, cats, m, vis));  
    }
}