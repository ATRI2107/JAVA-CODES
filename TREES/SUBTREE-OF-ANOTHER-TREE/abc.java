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
    boolean exactSubtree(Node s,Node t)
    {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.data==t.data) return (exactSubtree(s.left,t.left) && exactSubtree(s.right,t.right));
        return false;
    }
    boolean subtree(Node s,Node t)
    {
        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        return (exactSubtree(s,t) || subtree(s.left,t) || subtree(s.right,t));
    }
}
class abc
{
    public static void main(String[] args) {
        Node s=new Node(3);
        s.left=new Node(4);
        s.right=new Node(5);
        s.left.left=new Node(1);
        s.left.right=new Node(2);

        Node t=new Node(4);
        t.left=new Node(1);
        t.right=new Node(2);

        System.out.println(new Tree().subtree(s, t));
    }
}