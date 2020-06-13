import java.util.*;
class abc
{
    class pair
    {
        int x,y;
        pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    int activitySelection(int start[], int end[], int n)
    {
        ArrayList<pair> al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            al.add(new pair(start[i],end[i]));
        }
        Collections.sort(al,new Comparator<pair>(){
           public int compare(pair p1,pair p2)
           {
               return Integer.compare(p1.y,p2.y);
           }
        });
        ArrayList<pair> res=new ArrayList<>();
        res.add(al.get(0));
        for(int i=1;i<al.size();i++)
        {
            pair last=res.get(res.size()-1);
            if(al.get(i).x>=last.y) res.add(al.get(i));
        }
        return res.size();
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int start[]=new int[n];
        int end[]=new int[n];
        for(int i=0;i<n;i++)
        {
            start[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            end[i]=sc.nextInt();
        }
        System.out.println(new abc().activitySelection(start, end, n));
    }
}
