class abc
{
    public static void main(String[] args) {
        int a[]={5,3,8,4,2,7,1,10};
        int l=0,h=a.length-1,t;
        int i=l-1,j=h+1;
        int pivot=a[l];
        while(true)
        {
            do
            {
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }while(a[j]>pivot);
            if(i>=j)
            {
                break;
            }
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }
}