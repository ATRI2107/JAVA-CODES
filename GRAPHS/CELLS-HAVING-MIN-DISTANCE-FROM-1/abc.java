import java.util.*;
class Pair
{
    int i,j;
    Pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class Graph
{
    int R,C;
    boolean isSafe(int i,int j)
    {
        return (i>=0 && i<R && j>=0 && j<C);
    }
    void printMinDistanceCells(ArrayList<ArrayList<Integer>> g,int n,int m)
    {
        R=n;
        C=m;
        int res[][]=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(g.get(i).get(j)==1)
                {
                    res[i][j]=0;
                    q.add(new Pair(i,j));
                }
                else
                {
                    res[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        int row[]={-1,0,1,0};
        int col[]={0,-1,0,1};
        while(!q.isEmpty())
        {
            Pair curr=q.poll();
            int x=curr.i,y=curr.j;
            for(int k=0;k<4;k++)
            {
                int i=x+row[k],j=y+col[k];
                if(isSafe(i, j) && res[i][j]>res[x][y]+1)
                {
                    res[i][j]=res[x][y]+1;
                    q.add(new Pair(i,j));
                }

            }
        }
        for(int i[]:res)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
class abc
{
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<m;j++)
            {
                temp.add(sc.nextInt());
            }
            g.add(temp);
        }
        new Graph().printMinDistanceCells(g, n, m);
        sc.close();
    }
}