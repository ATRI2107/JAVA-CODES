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
    Node prePost(int[] pre,int[] post)
    {
        int n=pre.length;
        if(n==0) return null;
        Node root=new Node(pre[0]);
        if(n==1) return root;
        int l=0;
        for(int i=0;i<n;i++)
        {
            if(pre[1]==post[i])
            {
                l=i+1;
                break;
            }
        }
        root.left=prePost(Arrays.copyOfRange(pre, 1, l+1),Arrays.copyOfRange(post, 0, l));
        root.right=prePost(Arrays.copyOfRange(pre, l+1, n),Arrays.copyOfRange(post, l, n-1));
        return root;
    }
    void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
class abc
{
    public static void main(String[] args) {
        int[] pre = {1,2,4,5,3,6,7}, post ={4,5,2,6,7,3,1};
        Tree obj=new Tree();
        obj.preorder(obj.prePost(pre, post));
        System.out.println();
    }
}