import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        HashSet<Integer> hs=new HashSet<>();
        HashSet<ArrayList<Integer>> hslist=new HashSet<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int target=-a[i]-a[j];
                if(hs.contains(target))
                {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(a[i]);
                    temp.add(a[j]);
                    temp.add(target);
                    if(!hslist.contains(temp))
                    {
                        res.add(temp);
                        hslist.add(temp);
                    }
                }
            }
            hs.add(a[i]);
        }
        System.out.println(res);
    }
}