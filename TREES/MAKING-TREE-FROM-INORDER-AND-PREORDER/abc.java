class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
    }
}
class Tree
{
    int preIndex=0;
    Node makeTree(int[] in,int[] pre,int is,int ie)
    {
        if(is>ie) return null;
        Node root=new Node(pre[preIndex++]);
        int inIndex=0;
        for(int i=is;i<=ie;i++)
        {
            if(in[i]==root.data)
            {
                inIndex=i;
                break;
            }
        }
        root.left=makeTree(in, pre, is, inIndex-1);
        root.right=makeTree(in, pre, inIndex+1, ie);
        return root;
    }
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
}
class abc
{
    public static void main(String[] args) {
        int in[]={20,10,40,30,50};
        int pre[]={10,20,30,40,50};
        Tree obj=new Tree();
        Node root=obj.makeTree(in, pre, 0, in.length-1);
        obj.inorder(root); //to confirm the logic
        System.out.println();
    }
}