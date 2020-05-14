import java.util.*;
class abc
{
	void swap(int[] a,int i,int j)
    {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    void Maxheapify(int a[],int n,int i)
    {
        int largest=i,left=2*i+1,right=2*i+2;
        if(left<n && a[left]>a[largest]) largest=left;
        if(right<n && a[right]>a[largest]) largest=right;
        if(largest!=i)
        {
            swap(a, i, largest);
            Maxheapify(a, n, largest);
        }
    }
    void buildHeap(int[] a,int n)
    {
        for(int i=(n-2)/2;i>=0;i--)
        {
            Maxheapify(a, n, i);
        }
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
        abc obj=new abc();
        obj.buildHeap(a, n);
        for(int i=n-1;i>=1;i--)
        {
            obj.swap(a, i, 0);
            obj.Maxheapify(a, i, 0);
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
