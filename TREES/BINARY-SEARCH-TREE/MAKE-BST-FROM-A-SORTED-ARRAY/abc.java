import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
    }
}
class Tree
{
    Node BST(int[] nums,int low,int high)
    {
        if(low<=high)
        {
            int mid=low+(high-low)/2;
            Node root=new Node(nums[mid]);
            root.left=BST(nums, low, mid-1);
            root.right=BST(nums,mid+1,high);
            return root;
        }
        else
        {
            return null;
        }
    }
    Node arrayToBST(int[] nums)
    {
        return(BST(nums,0,nums.length-1));
    }
    void inorder(Node root) // To confirm the logic
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
class abc
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        Node root=new Tree().arrayToBST(nums);
        new Tree().inorder(root);
        System.out.println();
        sc.close();
    }
}