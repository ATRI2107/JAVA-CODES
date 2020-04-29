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
    int min=Integer.MAX_VALUE;
    Integer prev=null;
    void mini(Node root)
    {
        if(root==null) return;
        mini(root.left);
        if(prev!=null)
        {
            min=Math.min(min,root.data-prev);
        }
        prev=root.data;
        mini(root.right);
    }
    int getMinimumDiff(Node root)
    {
        mini(root);
        return min;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(0);
        root.right=new Node(2236);
        root.right.left=new Node(1277);
        root.right.right=new Node(2776);
        root.right.left.left=new Node(519);
        System.out.println(new Tree().getMinimumDiff(root));
    }
}