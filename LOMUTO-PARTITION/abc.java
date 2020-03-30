class abc
{
    public static void main(String[] args) {
        int a[]={10,80,30,90,40,50,70};
        int l=0,h=a.length-1;
        int pivot=a[h];
        int i=l-1,t;
        for(int j=l;j<=h-1;j++)
        {
            if(a[j]<pivot)
            {
                i++;
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        t=a[i+1];
        a[i+1]=a[h];
        a[h]=t;
        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }
}