class abc
{
    public static void main(String[] args) {
        int a[]={4,1,1,4,2,1};
        int incl=a[0],excl=0;
        for(int i=1;i<a.length;i++)
        {
            int temp=incl;
            incl=Math.max(a[i]+excl,incl);
            excl=incl;
        }
        System.out.println(incl);
    }
}