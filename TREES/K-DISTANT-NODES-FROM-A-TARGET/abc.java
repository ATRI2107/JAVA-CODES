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
    ArrayList<Integer> res=new ArrayList<>();
    ArrayList<Integer> kdist(Node root,Node target,int k)
    {
        dfs(root,target,k);
        return res;
    }
    int dfs(Node root,Node target,int k)
    {
        if(root==null) return -1;
        else if(root==target)
        {
            kdistroot(root,0,k); // finding k distance below the target
            return 1;
        }
        else
        {
            int l=dfs(root.left,target,k),r=dfs(root.right,target,k);
            if(l!=-1)
            {
                if(l==k) res.add(root.data);
                kdistroot(root.right,l+1,k);
                return l+1;
            }
            else if(r!=-1)
            {
                if(r==k) res.add(root.data);
                kdistroot(root.left,r+1,k);
                return r+1;
            }
            else
            {
                return -1;
            }
        }
    }
    void kdistroot(Node root,int d,int k)
    {
        if(root==null) return;
        if(d==k)
        {
            res.add(root.data);
        }
        else
        {
            kdistroot(root.left, d+1, k);
            kdistroot(root.right, d+1, k);
        }
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(2);
        root.left=new Node(7);
        root.left.left=new Node(10);
        root.left.right=new Node(6);
        root.left.right.left=new Node(5);
        root.left.right.right=new Node(11);
        root.right=new Node(9);
        root.right.right=new Node(3);
        for(Integer i:new Tree().kdist(root,root.left,2))
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}