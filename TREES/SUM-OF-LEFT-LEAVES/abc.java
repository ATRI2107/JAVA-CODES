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
    int s=0;
    void preorder(Node root,int check)
    {
        if(root==null) return;
        if(root.left==null && root.right==null && check==1)
        s+=root.data;
        preorder(root.left,1);
        preorder(root.right,0);
    }
    int sumLeft(Node root)
    {
        if(root==null || (root.left==null && root.right==null)) return 0;
        preorder(root,1);
        return s;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(new Tree().sumLeft(root));
    }
}