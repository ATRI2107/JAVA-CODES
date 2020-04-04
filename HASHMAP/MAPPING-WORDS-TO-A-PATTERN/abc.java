import java.util.*;
class abc
{
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    LinkedHashMap<Character,Character> lm=new LinkedHashMap<>();
	    ArrayList<String> al=new ArrayList<>();
	    for(String s:dict)
	    {
	        int c=1;
	        for(int i=0;i<pattern.length();i++)
	        {
	            char x=pattern.charAt(i);
	            char y=s.charAt(i);
	            if(lm.containsKey(x) && (Character)lm.get(x)!=y) 
	            {
	                c=0;
	                break;
	            }
	            lm.put(x,y);
	        }
	        if(c==1) al.add(s);
            lm.clear();
        }
	    return al;
	}
    public static void main(String[] args) {
        int n;
        ArrayList<String> al=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            al.add(sc.next());
        }
        String pattern=sc.next();
        ArrayList<String> res=findMatchedWords(al, pattern);
        for(String s:res)
        {
            System.out.print(s+" ");
        }
        System.out.println();
        sc.close();
    }
}