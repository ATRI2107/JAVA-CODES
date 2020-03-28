import java.util.*;
class abc
{
    static int countandMerge(int[] a,int l,int mid,int r)
    {
        int left=mid-l+1;
        int right=r-mid;
        int la[]=new int[left];
        int ra[]=new int[right];
        for(int i=0;i<left;i++)
        {
            la[i]=a[l+i];
        }
        for(int j=0;j<right;j++)
        {
            ra[j]=a[mid+1+j];
        }
        int i=0,j=0,k=l,res=0;
        while(i<left && j<right)
        {
            if(la[i]<ra[j])
            {
                a[k++]=la[i++];
            }
            else
            {
                a[k++]=ra[j++];
                res+=left-i;
            }
        }
        while(i<left)
        {
            a[k++]=la[i++];
        }
        while(j<right)
        {
            a[k++]=ra[j++];
        }
        return res;
    }
    static int countinv(int[] a,int l,int r)
    {
        int res=0;
        if(l<r)
        {
            int mid=l+(r-l)/2;
            res+=countinv(a, 0, mid);
            res+=countinv(a, mid+1, r);
            res+=countandMerge(a,l,mid,r);
        }
        return res;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("No. of Inversions= "+countinv(a,0,n-1));
        sc.close();
    }
}