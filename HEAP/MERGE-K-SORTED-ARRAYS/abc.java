import java.util.*;
class Triplet 
{
    int  val,ap,ep;
    Triplet(int val,int ap,int ep)
    {
        this.val=val; // stores the value of a list
        this.ap=ap; // stores the array position from which val belongs
        this.ep=ep; // stores the position of val in that list
    }
    
}
class abc
{
    static ArrayList<Integer> mergeK(ArrayList<ArrayList<Integer>> arr)
    {
        PriorityQueue<Triplet> pq=new PriorityQueue<>(new Comparator<Triplet>(){
            public int compare(Triplet t1,Triplet t2)
            {
                return Integer.compare(t1.val, t2.val);
            }
        });
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            pq.add(new Triplet(arr.get(i).get(0), i, 0));
        }
        while(!pq.isEmpty())
        {
            Triplet curr=pq.poll();
            res.add(curr.val);
            int ap=curr.ap;
            int ep=curr.ep;
            if(ep+1<arr.get(ap).size())
            {
                pq.add(new Triplet(arr.get(ap).get(ep+1), ap, ep+1));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            arr.add(temp);
        }
        for(Integer i:mergeK(arr))
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}