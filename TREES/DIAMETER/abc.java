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
    int res=0;
    int height(Node root)
    {
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        res=Math.max(res,1+lh+rh); //formula for diameter= 1+ leftHeight+ rightHeight
        return 1+Math.max(lh,rh);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.left.left=new Node(50);
        root.right.right=new Node(60);
        root.right.right.right=new Node(70);
        Tree obj=new Tree();
        obj.height(root);
        System.out.println(obj.res);
    }
}