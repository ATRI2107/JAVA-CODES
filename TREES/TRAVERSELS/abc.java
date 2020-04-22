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
    void levelOrder(Node root)
    {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Node head=q.poll();
                System.out.print(head.data+" ");
                if(head.left!=null) q.add(head.left);
                if(head.right!= null) q.add(head.right);
            }
            System.out.println();            
        }
        System.out.println();        
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
    void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        Tree obj=new Tree();
        obj.inorder(root);
        System.out.println();
        obj.preorder(root);
        System.out.println();
        obj.postorder(root);
        System.out.println();
        obj.levelOrder(root);
    }
}