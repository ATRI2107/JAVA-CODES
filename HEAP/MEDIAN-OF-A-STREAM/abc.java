import java.util.*;
class abc
{
    public static void main(String[] args) {
        PriorityQueue<Integer> g=new PriorityQueue<>();
        PriorityQueue<Integer> s=new PriorityQueue<>(Collections.reverseOrder());
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        s.add(a[0]);
        System.out.print(a[0]+" ");
        for(int i=1;i<n;i++)
        {
            int x=a[i];
            if(s.size()>g.size())
            {
                if(s.peek()>x)
                {
                    g.add(s.poll());
                    s.add(x);
                }
                else
                g.add(x);
                System.out.print(String.format("%.1f", (s.peek()+g.peek())/2.0)+" ");
            }
            else
            {
                if(x<=s.peek())
                s.add(x);
                else
                {
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.print(s.peek()+" ");
            }
        }
    }
}