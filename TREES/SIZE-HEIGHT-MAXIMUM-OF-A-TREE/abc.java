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
    int getSize(Node root)
    {
        if(root==null) return 0;
        return (1+getSize(root.left)+getSize(root.right));
    }
    int getMax(Node root)
    {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(getMax(root.left),getMax(root.right)));
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
        System.out.println("Number of Nodes in the tree= "+obj.getSize(root));
        System.out.println("Max of the binary tree= "+obj.getMax(root));
    }
}