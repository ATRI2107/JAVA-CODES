import java.util.*;
class pair
{
    int i,j;
    pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class Graph
{
    int R,C;
    boolean isSafe(ArrayList<ArrayList<Integer>> list,int i,int j,boolean[][] vis)
    {
        return(i>=0 && i<R && j>=0 && j<C && list.get(i).get(j)==1 && !vis[i][j]);
    }
    void bfs(ArrayList<ArrayList<Integer>> list,int i,int j,boolean[][] vis)
    {
        Queue<pair> q=new LinkedList<>();
        int row[]={-1,-1,-1,0,0,1,1,1}; // Arrays for all the 8 neighbours of a point
        int col[]={-1,0,1,-1,1,-1,0,1};
        q.add(new pair(i,j));
        vis[i][j]=true;
        while(!q.isEmpty())
        {
            pair curr=q.poll();
            int x=curr.i,y=curr.j;
            for(int k=0;k<8;k++)
            {
                if(isSafe(list,x+row[k],y+col[k],vis))
                {
                    vis[x+row[k]][y+col[k]]=true;
                    q.add(new pair(x+row[k],y+col[k]));
                }
            }
        }
    }
     int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M) {
        R=N;
        C=M;
        int res=0;
        boolean vis[][]=new boolean[R][C];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(list.get(i).get(j)==1 && !vis[i][j])
                {
                    bfs(list,i,j,vis);
                    res++;
                }
            }
        }
        return res;
    }
}
class abc
{
    public static void main(String[] args) {
        int n=3,m=3;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> t=new ArrayList<>();
            for(int j=0;j<m;j++)
            {
                t.add(sc.nextInt());
            }
            list.add(t);
        }
        Graph obj=new Graph();
        System.out.println(obj.findIslands(list, n, m));
        sc.close();
    }

}