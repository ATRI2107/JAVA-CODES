import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++)
        {
            b[j]=sc.nextInt();
        }
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(i!=0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
            {
                System.out.print(a[i]+" ");
                i++;
            }
            else if(a[i]>b[j])
            {
                System.out.print(b[j]+" ");
                j++;
            }
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<n)
        {
            if(i==0 || a[i]!=a[i-1])
            {
                System.out.print(a[i]+" ");
            }
            i++;
        }
        while(j<m)
        {
            if(j==0 || b[j]!=b[j-1])
            System.out.print(b[j]+" ");
            j++;
        }
        sc.close();
    }
}