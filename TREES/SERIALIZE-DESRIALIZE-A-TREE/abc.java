import java.util.*;
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
    void serialize(Node root,ArrayList<Integer> al)
    {
        if(root==null)
        {
            al.add(-1); //We are using -1 to represent the null value
            return;
        }
        al.add(root.data);
        serialize(root.left, al);
        serialize(root.right, al);
    }
    void inorder(Node root) // To confirm the deserialize logic
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    int index=0;
    Node desrialize(ArrayList<Integer> al)
    {
        if(index==al.size()) return null;
        int val=al.get(index++);
        if(val==-1) return null;
        Node root=new Node(val);
        root.left=desrialize(al);
        root.right=desrialize(al);
        return root;
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
        ArrayList<Integer> al=new ArrayList<>();
        Tree obj=new Tree();
        obj.serialize(root, al);
        for(Integer i:al)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        obj.inorder(obj.desrialize(al));
        System.out.println();
    }
}