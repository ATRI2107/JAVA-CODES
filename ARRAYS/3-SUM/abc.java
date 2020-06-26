import java.util.*;
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0 || nums[i]!=nums[i-1]) // To check for duplicates if there then skip
            {
                int l=i+1;
                int h=nums.length-1;
                while(l<h)
                {
                    if(nums[i]+nums[l]+nums[h]==0)
                    {
                        res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                        while(l<h && nums[l]==nums[l+1]) l++; // To check for duplicates
                        while(l<h && nums[h]==nums[h-1]) h--; // to check for duplicates
                        l++;
                        h--;
                    }
                    else if(nums[i]+nums[l]+nums[h]>0) h--;
                    else l++;
                }
            }
        }
        System.out.println(res);
    }
}