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
    void serialize(Node root,ArrayList<Integer> al)
    {
        if(root==null)
        {
            al.add(-1);
            return;
        }
        al.add(root.data);
        serialize(root.left, al);
        serialize(root.right, al);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(60);
        root.left.right=new Node(70);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        ArrayList<Integer> al=new ArrayList<>();
        new Tree().serialize(root, al);
        for(Integer i:al)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}