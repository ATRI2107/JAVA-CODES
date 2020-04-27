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
    int c=0;
    int getKDistantfromLeaf(Node root,int k)
    {
        if(root==null || k<0) return -1;
        ArrayList<Integer> al=new ArrayList<>();
        boolean visited[]=new boolean[1000];
        getKDistant(root,k,al,visited,0);
        return c;
    }
    void getKDistant(Node root,int k,ArrayList<Integer> al,boolean[] visited,int i)
    {
        if(root==null) return;
        al.add(i,root.data);
        visited[i]=false;
        if(root.left==null && root.right==null && i-k>=0 && visited[i-k]==false)
        {
            c++;
            visited[i-k]=true;
            return;
        }
        getKDistant(root.left, k, al, visited, i+1);
        getKDistant(root.right, k, al, visited, i+1);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(60);
        root.left.right=new Node(70);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        Tree obj=new Tree();
        int k=1;
        System.out.println(obj.getKDistantfromLeaf(root, k));
    }
}