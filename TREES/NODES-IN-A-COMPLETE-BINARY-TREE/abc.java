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
    int countNode(Node root)
    {
        if(root==null) return 0;
        int lh=0,rh=0;
        Node curr=root;
        while(curr!=null)
        {
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null)
        {
            rh++;
            curr=curr.right;
        }
        if(lh==rh)
        return (int)(Math.pow(2,lh))-1;
        else
        return 1+countNode(root.left)+countNode(root.right);
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(60);
        root.left.right=new Node(70);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        System.out.println(new Tree().countNode(root));
    }
}
// Time complexity of O(logN * logN)