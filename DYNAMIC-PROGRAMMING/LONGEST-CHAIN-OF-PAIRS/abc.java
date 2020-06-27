import java.util.*;
class pair
{
    int x,y;
    pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        pair arr[]=new pair[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new pair(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr,new Comparator<pair>() {
            public int compare(pair p1,pair p2)
            {
                return Integer.compare(p1.x, p2.x);
            }
        });
        int lis[]=new int[n];
        for(int i=0;i<n;i++)
        {
            lis[i]=1;
            for(int j=0;j<i;j++)
            {
                if(arr[j].y<arr[i].x)
                lis[i]=Math.max(lis[i],lis[j]+1);
            }
        }
        int res=lis[0];
        for(int i:lis)
        {
            res=Math.max(res,i);
        }
        System.out.println(res);
    }
}