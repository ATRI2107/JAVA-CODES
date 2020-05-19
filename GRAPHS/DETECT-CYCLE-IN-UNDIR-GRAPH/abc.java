import java.util.*;
class Graph
{
    boolean dfs(ArrayList<ArrayList<Integer>> list,int s,int parent,boolean[] vis)
    {
        vis[s]=true;
        for(int u:list.get(s))
        {
            if(!vis[u])
            {
                if(dfs(list,u,s,vis))
                return true;
            }
            else if(u!=parent) 
            return true;
        }
        return false;
    }
     boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
       boolean vis[]=new boolean[V];
       for(int i=0;i<V;i++)
       {
           if(!vis[i])
           {
               if(dfs(list,i,-1,vis))
               return true;
           }
       }
       return false;
    }
}
class abc
{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        for(int i=0;i<v;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                temp.add(sc.nextInt());
            }
            al.add(temp);
        }
        System.out.println(new Graph().isCyclic(al,v));
        sc.close();
    }
}