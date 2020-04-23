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
    int balancedTree(Node root)
    {
        if(root==null) return 0;
        int lh=balancedTree(root.left);
        if(lh==-1) return -1;
        int rh=balancedTree(root.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        else
        return(Math.max(lh,rh)+1);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(12);
        root.right=new Node(15);
        root.right.left=new Node(16);
        root.right.right=new Node(14);
        Tree obj=new Tree();
        System.out.println(obj.balancedTree(root)==-1?"NO":"YES");
    }
}