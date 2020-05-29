import java.util.*;
class abc
{
    static void topologicalsort(ArrayList<ArrayList<Integer>> list,int N)
    {
        int in[]=new int[N];
        Arrays.fill(in,0);
        for(ArrayList<Integer> x:list)
        {
            for(int i:x)
            {
                in[i]++;
            }
        }
        boolean vis[]=new boolean[N];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++)
        {
            if(in[i]==0)
            {
                vis[i]=true;
                q.add(i);
            }
        }
        
        while(!q.isEmpty())
        {
            int curr=q.poll();
            System.out.print(curr+" ");
            for(int v:list.get(curr))
            {
                in[v]--;
                if(in[v]==0 && !vis[v])
                {
                    vis[v]=true;
                    q.add(v);
                }
            }
        }
        System.out.println();
        
    }
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
        topologicalsort(al, v);
    }
}