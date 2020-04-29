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
    HashMap<Integer,Integer> depth=new HashMap<>();
    HashMap<Integer,Node> parent=new HashMap<>();
    boolean isCousins(Node root,int x,int y)
    {
        preorder(root,null,0);
        return (depth.get(x)==depth.get(y) && parent.get(x)!=parent.get(y));
    }
    void preorder(Node root,Node par,int d)
    {
        if(root==null) return;
        depth.put(root.data,d);
        parent.put(root.data,par);
        preorder(root.left,root,d+1);
        preorder(root.right,root,d+1);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        System.out.println(new Tree().isCousins(root, 3, 4));
    }
}