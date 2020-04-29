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
    Node trimBST(Node root,int l,int r)
    {
        if(root==null) return root;
        if(root.data<l) return trimBST(root.right, l, r);
        if(root.data>r) return trimBST(root.left, l, r);
        root.left=trimBST(root.left, l, r);
        root.right=trimBST(root.right,l,r);
        return root;
    }
    void inorder(Node root)
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
        Node root=new Node(1);
        root.left=new Node(0);
        root.right=new Node(2);
        Tree obj=new Tree();
        obj.inorder(obj.trimBST(root, 1, 2));
        System.out.println();
    }
}
/*
Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.
*/