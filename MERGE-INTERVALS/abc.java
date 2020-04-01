import java.util.*;
class pair
{
    int start;
    int end;
    pair(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
}
class abc
{
    static void compare(pair[] arr,int n)
    {
        Arrays.sort(arr,new Comparator<pair>() {
            @Override public int compare(pair p1,pair p2)
            {
                return p1.start-p2.start;
            }
        });
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        pair arr[]=new pair[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new pair(sc.nextInt(), sc.nextInt());
        }
        compare(arr, n);
        int res=0;
        for(int i=1;i<n;i++)
        {
            if(arr[res].end>=arr[i].start)
            {
                arr[res].start=Math.min(arr[res].start,arr[i].start);
                arr[res].end=Math.max(arr[res].end,arr[i].end);
            }
            else
            {
                res++;
                arr[res]=arr[i];
            }
        }
        for(int i=0;i<=res;i++)
        {
            System.out.println(arr[i].start+" "+arr[i].end);
        }
        sc.close();
    }
}