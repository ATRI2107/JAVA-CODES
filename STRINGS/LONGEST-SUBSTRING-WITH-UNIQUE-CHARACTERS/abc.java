import java.util.*;
class abc
{
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int i=0,j=0;
        int res=0;
        HashSet<Character> hs=new HashSet<>();
        while(j<s.length())
        {
            if(!hs.contains(s.charAt(j)))
            {
                hs.add(s.charAt(j));
                res=Math.max(res,hs.size());
                j++;
            }
            else
            {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}