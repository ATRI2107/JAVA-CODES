import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int d)
    {
        data=d;
    }
}
class Tree
{
    int maxWidth(Node root)
    {
        if(root==null) return 0;
        int res=0;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            res=Math.max(res,count);
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        return res;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right=new Node(30);
        root.right.right=new Node(60);
        root.left.left.left=new Node(70);
        Tree obj=new Tree();
        System.out.println(obj.maxWidth(root));
    }
}