import java.util.*;
class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
    }
}
class Tree
{
    void dfs(Node root)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) System.out.print(root.data+" ");
        dfs(root.left);
        dfs(root.right);
    }
    void printLeft(Node root)
    {
        Node curr=root;
        while(curr!=null)
        {
            if(curr.left!=null || curr.right!=null) System.out.print(curr.data+" ");
            if(curr.left!=null) curr=curr.left;
            else
            curr=curr.right;
        }
    }
    void printRight(Node root)
    {
        Stack<Node> st=new Stack<>();
        Node curr=root;
        while(curr!=null)
        {
            if(curr.left!=null || curr.right!=null) st.push(curr);
            if(curr.right!=null) curr=curr.right;
            else
            curr=curr.left;
        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop().data+" ");
        }
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(60);
        root.right=new Node(30);
        Tree obj=new Tree();
        System.out.print(root.data+" ");
        obj.printLeft(root.left);
        obj.dfs(root);
        obj.printRight(root.right);
        System.out.println();
    }
}