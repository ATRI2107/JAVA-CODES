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
    boolean childSumProp(Node root)
    {
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        return (root.data==sum && childSumProp(root.left) && childSumProp(root.right));
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(12);
        root.right.left=new Node(3);
        root.right.right=new Node(9);
        Tree obj=new Tree();
        System.out.println(obj.childSumProp(root)?"YES":"NO");
    }
}