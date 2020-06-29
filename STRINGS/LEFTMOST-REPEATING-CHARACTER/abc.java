import java.util.*;
class abc
{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        final int CHAR=256;
        boolean vis[]=new boolean[CHAR];
        int res=-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(vis[s.charAt(i)])
            res=i;
            else
            vis[s.charAt(i)]=true;
        }
        System.out.println(s.charAt(res));
    }
}