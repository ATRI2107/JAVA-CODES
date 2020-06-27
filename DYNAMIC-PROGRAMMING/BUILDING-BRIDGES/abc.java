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
class test
{
    int ceil(int[] tail,int b,int e,int x)
    {
        int l=b,r=e;
        while(l<r)
        {
            int m=l+(r-l)/2;
            if(x<=tail[m])
            r=m;
            else
            l=m+1;
        }
        return r;
    }
    int lis(pair[] arr,int n)
    {
        Arrays.sort(arr,new Comparator<pair>(){
            public int compare(pair p1,pair p2)
            {
                int k=Integer.compare(p1.x,p2.x);
                return k==0?Integer.compare(p1.y, p2.y):k;
            }
        });
        int tail[]=new int[n];
        tail[0]=arr[0].y;
        int len=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i].y>tail[len-1])
            {
                tail[len]=arr[i].y;
                len++;
            }
            else
            {
                int c=ceil(tail,0,len-1,arr[i].y);
                tail[c]=arr[i].y;
            }
        }
        return len;
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
        System.out.println(new test().lis(arr, n));
        sc.close();
    }
}