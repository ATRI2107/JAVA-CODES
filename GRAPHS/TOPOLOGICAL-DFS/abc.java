import java.util.*;
class Graph
{
    void topological(ArrayList<ArrayList<Integer>> al,boolean[] vis,int v)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<v;i++)
        {
            if(!vis[i])
            dfs(al,i,st,vis);
        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop()+" ");
        }
    }
    void dfs(ArrayList<ArrayList<Integer>> al,int s,Stack<Integer> st,boolean[] vis)
    {
        vis[s]=true;
        for(int u:al.get(s))
        {
            if(!vis[u]) dfs(al, u, st, vis);
        }
        st.push(s);
    }

}
class abc
{
    public static void main(String[] args) {
        int v;
        Scanner sc=new Scanner(System.in);
        v=sc.nextInt();
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
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
        boolean vis[]=new boolean[v];
        new Graph().topological(al, vis, v);
        System.out.println();
        sc.close();
    }
}