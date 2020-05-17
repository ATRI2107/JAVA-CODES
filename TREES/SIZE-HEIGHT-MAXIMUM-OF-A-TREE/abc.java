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
    int getHeight(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    int minDepth(Node root)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        if(root.left==null) return 1+minDepth(root.right);
        if(root.right==null) return 1+minDepth(root.left);
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
    void printKDist(Node root,int k)
    {
        if(root==null) return;
        if(k==0)
        {
            System.out.print(root.data+" ");
        }
        else
        {
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }
    int c=0;
    void countLeafNodes(Node root)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) c++;
        countLeafNodes(root.left);
        countLeafNodes(root.right);
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
        System.out.println("Number of Nodes in the tree= "+obj.getSize(root));
        System.out.println("Max of the binary tree= "+obj.getMax(root));
        System.out.println("Height of the tree= "+obj.getHeight(root));
        System.out.print("Nodes at a distance k: ");
        obj.printKDist(root, 2); //here k is 2
        System.out.println();
        obj.countLeafNodes(root);
        System.out.println("Number of Leaf Nodes="+obj.c);
        System.out.println("Min Depth= "+obj.minDepth(root));
    }
}