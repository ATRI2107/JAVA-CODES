import java.util.*;
class Graph
{
    int N;
    class cell
    {
        int x,y,dis;
        cell(int x,int y,int dis)
        {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    }
    boolean issafe(int i,int j,boolean[][] vis)
    {
        return (i>=0 && i<N && j>=0 && j<N && !vis[i][j]);
    }
    int steps(int[] knight,int[] target,int n)
    {
        N=n+1;
        boolean[][] vis=new boolean[N][N];
        Queue<cell> q=new LinkedList<>();
        q.add(new cell(knight[0],knight[1],0));
        vis[knight[0]][knight[1]]=true;
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};  
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
        while(!q.isEmpty())
        {
            cell curr=q.poll();
            if(curr.x==target[0] && curr.y==target[1]) return curr.dis;
            for(int k=0;k<8;k++)
            {
                int i=curr.x+dx[k],j=curr.y+dy[k];
                if(issafe(i, j, vis))
                {
                    vis[i][j]=true;
                    q.add(new cell(i, j, curr.dis+1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] knight=new int[2];
        int[] target=new int[2];
        knight[0]=sc.nextInt();
        knight[1]=sc.nextInt();
        target[0]=sc.nextInt();
        target[1]=sc.nextInt();
        System.out.println(new Graph().steps(knight, target, n));
    }
}