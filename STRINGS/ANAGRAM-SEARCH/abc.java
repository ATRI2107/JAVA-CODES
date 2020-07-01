
import java.util.*;

class abc {
    static final int CHAR=256;
    static boolean isSame(int[] a,int[] b)
    {
        
        for(int i=0;i<256;i++)
        {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    static int check(String s,String p)
    {
        int tf[]=new int[CHAR];
        int pf[]=new int[CHAR];
        int i;
        int res=0;
        for(i=0;i<p.length();i++)
        {
            tf[s.charAt(i)]++;
            pf[p.charAt(i)]++;
        }
        
        for(i=p.length();i<s.length();i++)
        {
            if(isSame(tf,pf))
            {
                res++;
            }
            tf[s.charAt(i)]++;
            tf[s.charAt(i-p.length())]--;
        }
        if(isSame(tf,pf))
        {
            res++;
        }
        return res;
    }
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    while(t-->0)
	    {
	        String s=sc.next();
	        String p=sc.next();
	        System.out.println(check(s,p));
	        
	    }
	}
}