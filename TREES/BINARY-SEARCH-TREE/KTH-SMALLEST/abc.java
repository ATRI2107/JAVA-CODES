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
    int count(Node root)
    {
        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);
    }
    public int KthSmallestElement(Node root, int k) 
    {
        if(root==null) return -1;
        int lcount=count(root.left);
        if(k==lcount+1) return root.data;
        else if(k<lcount+1) return KthSmallestElement(root.left,k);
        else
        return KthSmallestElement(root.right,k-lcount-1);
        
        
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(2);
        root.left.left=new Node(1);
        root.right=new Node(6);
        System.out.println(new Tree().KthSmallestElement(root, 2));
    }
}