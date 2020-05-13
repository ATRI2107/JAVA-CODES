import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++)
        {
            pq.add(a[i]);
        }
        int index=0;
        for(int i=k+1;i<n;i++)
        {
            a[index++]=pq.poll();
            pq.add(a[i]);
        }
        while(!pq.isEmpty())
        {
            a[index++]=pq.poll();
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}