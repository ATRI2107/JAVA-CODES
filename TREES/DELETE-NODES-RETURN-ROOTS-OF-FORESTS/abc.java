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
    ArrayList<Node> res=new ArrayList<>();
    ArrayList<Node> delNodes(Node root,int[] del_nodes)
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:del_nodes)
        {
            hs.add(i);
        }
        if(!hs.contains(root.data))
        {
            res.add(root);
        }
        postorder(root,hs);
        return res;
    }
    Node postorder(Node root,HashSet<Integer> hs)
    {
        if(root==null) return root;
        root.left=postorder(root.left,hs);
        root.right=postorder(root.right,hs);
        if(hs.contains(root.data))
        {
            if(root.left!=null) res.add(root.left);
            if(root.right!=null) res.add(root.right);
            return null;
        }
        return root;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Tree obj=new Tree();
        int del_nodes[]={3,5};
        for(Node t:obj.delNodes(root, del_nodes))
        {
            System.out.print(t.data+" ");
        }
        System.out.println();
    }
}