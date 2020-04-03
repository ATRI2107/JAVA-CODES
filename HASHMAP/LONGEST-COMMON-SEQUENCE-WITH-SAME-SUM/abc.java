import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
            b[i]=a[i]-b[i];
        }
        int res=0,s=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            s+=b[i];
            
            if(s==0) res=i+1;
            if(hm.containsKey(s)) res=Math.max(res,i-hm.get(s));
            else hm.put(s,i);
        }
        System.out.println(res);
        sc.close();
    }
}