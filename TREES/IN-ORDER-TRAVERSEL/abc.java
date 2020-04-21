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
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        Tree obj=new Tree();
        obj.inorder(root);
    }
}