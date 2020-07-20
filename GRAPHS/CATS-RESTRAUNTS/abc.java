import java.util.*;
public class abc
{
    ArrayList<ArrayList<Integer>> paths=new ArrayList<>();
    void dfs(ArrayList<Integer> adj[],int s,LinkedList<Integer> path)
    {
        path.add(s);
        
        if(adj[s].size()==0)
        {
            /*for(int i:path)
            {
                System.out.print(i+" ");
            }
            System.out.println();*/
            ArrayList<Integer> temp=new ArrayList<>();
            temp.addAll(path);
            paths.add(temp);
            path.removeLast();
            return;
        }
        for(int u: adj[s])
        {
            dfs(adj, u, path);           
        }
        path.removeLast();  
    }
    int numberOfRestraunts(int[] conseq,int m)
    {
        
        int able_to_visit=0;
        for(ArrayList<Integer> p:paths)
        {
            int count=0,res=Integer.MIN_VALUE;
            for(int i=1;i<p.size();i++)
            {
                if(conseq[p.get(i)]==1 && conseq[p.get(i-1)]==1)
                {
                    count++;
                    res=Math.max(count+1,res);
                    // System.out.println(res);
                }
                else
                {
                    count=0;
                }
            }
            if(res<=m) able_to_visit++;
        }
        return able_to_visit;
    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int conseq[]=new int[n+1];
        conseq[0]=0;
        for(int i=1;i<=n;i++)
        {
            conseq[i]=sc.nextInt();
        }
        ArrayList<Integer> adj[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y<x)
            adj[y].add(x);
            else
            adj[x].add(y);
            
        }
        
        abc obj=new abc();
        obj.dfs(adj, 1, new LinkedList<>());
        System.out.println(obj.numberOfRestraunts(conseq,m));
        sc.close();
    }
}