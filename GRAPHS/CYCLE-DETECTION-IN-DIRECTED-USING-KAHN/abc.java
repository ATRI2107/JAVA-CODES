import java.util.*;
class Graph
{
    boolean CycleDetect(ArrayList<ArrayList<Integer>> al,int v)
    {
        int in[]=new int[v];
        Arrays.fill(in,0);
        for(ArrayList<Integer> i:al)
        {
            for(int j:i)
            {
                in[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int u:al.get(curr))
            {
                in[u]--;
                if(in[u]==0)
                q.add(u);
            }
            count++;
        }
        return count!=v;
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
        System.out.println(new Graph().CycleDetect(al, v));
        sc.close();
    }
}