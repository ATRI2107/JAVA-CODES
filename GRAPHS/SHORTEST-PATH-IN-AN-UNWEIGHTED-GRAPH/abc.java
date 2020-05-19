import java.util.*;
class Graph
{
    void shortestPath(ArrayList<ArrayList<Integer>> al,int s,int v,boolean[] visited)
    {
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        int dist[]=new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[s]=0;
        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int x:al.get(curr))
            {
                if(!visited[x])
                {
                    dist[x]=dist[curr]+1;
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        for(int i:dist)
        {
            System.out.print(i+" ");
        }
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
        boolean visited[]=new boolean[v];
        new Graph().shortestPath(al, 0, v, visited);
        sc.close();

    }
}