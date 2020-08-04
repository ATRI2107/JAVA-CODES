import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        boolean prime[]=new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i])
            {
                for(int j=2;j*i<=n;j++)
                {
                    prime[i*j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(prime[i]) System.out.print(i+" ");
        }
        System.out.println();
    }
}