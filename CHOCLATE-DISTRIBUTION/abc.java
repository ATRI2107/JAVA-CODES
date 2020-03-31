import java.util.Arrays;

class abc
{
    public static void main(String[] args) {
        int arr[]={7,3,2,4,9,12,56};//Array packets with no. of choclates given
        int m=3;//Number of children
        Arrays.sort(arr);
        int res=arr[m-1]-arr[0];
        for(int i=1;i+m-1<arr.length;i++)
        {
            res=Math.min(res,arr[i+m-1]-arr[i]);
        }
        System.out.print(res);
    }
}