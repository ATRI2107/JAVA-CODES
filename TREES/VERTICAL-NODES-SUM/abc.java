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
    void dfs(Node root,TreeMap<Integer,Integer> tm,int hd)
    {
        if(root==null) return;
        if(tm.containsKey(hd))
        {
            tm.put(hd,tm.get(hd)+root.data);
        }
        else
        {
            tm.put(hd,root.data);
        }
        dfs(root.left,tm,hd-1);
        dfs(root.right,tm,hd+1);
    }
    void vertical(Node root)
    {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        dfs(root, tm, 0);
        for(Map.Entry m:tm.entrySet())
        {
            System.out.print(m.getValue()+" ");
        }
        System.out.println(); 
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(30);
        root.left.right=new Node(40);
        root.right=new Node(50);
        new Tree().vertical(root);
    }
}