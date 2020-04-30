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
    Node lca(Node root,Node p,Node q)
    {
        if(root==null) return null;
        if(p.data<root.data && q.data<root.data)
        return lca(root.left,p,q);
        else if(p.data>root.data && q.data>root.data)
        return lca(root.right,p,q);
        else
        return root;
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(6);
        root.left=new Node(2);
        root.left.left=new Node(0);
        root.left.right=new Node(4);
        root.right=new Node(8);
        root.right.left=new Node(7);
        root.right.right=new Node(9);

        Node p=new Node(0);
        Node q=new Node(4);
        System.out.println(new Tree().lca(root, p, q).data);
    }
}