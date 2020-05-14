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
    void diagonalSum(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            int s=0;
            for(int i=0;i<count;i++)
            {
                Node curr=q.poll();
                while(curr!=null)
                {
                    s+=curr.data;
                    if(curr.left!=null) q.add(curr.left);
                    curr=curr.right;
                }
            }
            System.out.print(s+" ");
        }
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(1);
        root.right=new Node(3);
        root.right.left=new Node(3);
        new Tree().diagonalSum(root);
        System.out.println();
    }
}