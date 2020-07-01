import java.util.*;
class abc
{
    static final int CHAR=256;
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
    static int findRank(String S) 
    {
        int count[]=new int[CHAR];
        for(char x:S.toCharArray())
        {
            count[x]++;
            if(count[x]>1) return 0;
        }
        for(int i=1;i<CHAR;i++)
        {
            count[i]+=count[i-1];
        }
        int n=S.length();
        int m=factorial(n);
        int res=1;
        for(int i=0;i<n-1;i++)
        {
            m=m/(n-i);
            res+=count[S.charAt(i)-1]*m;
            for(int j=S.charAt(i);j<CHAR;j++)
            {
                count[j]--;
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(findRank(s));
    }
}