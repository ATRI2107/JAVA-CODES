import java.util.*;
class hashmap
{
    static void CharFreq(String s)
    {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        char a[]=s.toCharArray();
        for(char c:a)
        {
            if(hm.containsKey(c))
            hm.put(c,hm.get(c)+1);
            else
            hm.put(c,1);
        }
        for(Map.Entry m:hm.entrySet())
        {
            System.out.print(m.getKey()+" "+m.getValue());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        x=sc.next();
        CharFreq(x);
        sc.close();
    }
}