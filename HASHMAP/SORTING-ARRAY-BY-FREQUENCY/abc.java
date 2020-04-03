import java.util.*;
class abc
{
    static LinkedHashMap<Integer,Integer> sortByValue(HashMap<Integer,Integer> hm)
    {
        ArrayList<Map.Entry<Integer,Integer>> al=new ArrayList<>(hm.entrySet());
        Collections.sort(al,new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare(Map.Entry<Integer,Integer> m1,Map.Entry<Integer,Integer> m2)
            {
                int k=m2.getValue().compareTo(m1.getValue());
                return (k==0?m1.getKey().compareTo(m2.getKey()):k);
            }
        });
        LinkedHashMap<Integer,Integer> temp=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> i:al)
        {
            temp.put(i.getKey(),i.getValue());
        }
        return temp;
    }
    static void sortByFrequency(int[] a,int n)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:a)
        {
            if(hm.containsKey(i)) hm.put(i,hm.get(i)+1);
            else hm.put(i,1);
        }
        LinkedHashMap<Integer,Integer> lm=sortByValue(hm);
        for(Map.Entry<Integer,Integer> m:lm.entrySet())
        {
            for(int i=0;i<(Integer)(m.getValue());i++)
            {
                System.out.print(m.getKey()+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sortByFrequency(a,n);
        sc.close();
    }
}