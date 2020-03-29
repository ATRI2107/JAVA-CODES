class abc
{
    public static void main(String[] args) {
        int a[]={5,13,6,9,12,11,8};
        int l=0,h=a.length-1,p=6,k=0;
        int temp[]=new int[h-l+1];
        for(int i=l;i<=h;i++)
        {
            if(a[i]<=a[p])
            {
                temp[k++]=a[i];
            }
        }
        for(int i=l;i<=h;i++)
        {
            if(a[i]>a[p])
            {
                temp[k++]=a[i];
            }
        }
        for(int i=l;i<=h;i++)
        a[i]=temp[i-l];
        for(int i:a)
        System.out.print(i+" ");
    }
}