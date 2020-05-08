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
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(a[0]);
        System.out.print(-1+" ");
        for(int i=1;i<n;i++)
        {
            System.out.print((ts.ceiling(a[i])!=null?ts.ceiling(a[i]):-1)+" ");
            ts.add(a[i]);
        }
        System.out.println();
        sc.close();
}
}