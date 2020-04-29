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
    void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.right);
            s+=root.data;
            root.data=s;
            inorder(root.left);
        }
    }
    void normal_inorder(Node root)
    {
        if(root!=null)
        {
            normal_inorder(root.left);
            System.out.print(root.data+" ");
            normal_inorder(root.right);
        }
    }
}
class abc
{
    public static void main(String[] args) {
        Node root=new Node(5);
        root.right=new Node(13);
        root.left=new Node(2);
        new Tree().inorder(root);
        new Tree().normal_inorder(root);
        System.out.println();
    }
}
/*
Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
*/