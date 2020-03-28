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
            if(a[i]<b[j])
            i++;
            else if(a[i]>b[j])
            j++;
            else
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        sc.close();
    }
}