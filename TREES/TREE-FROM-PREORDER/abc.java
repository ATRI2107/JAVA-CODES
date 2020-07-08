import java.util.*;
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
    Node construct(int[] pre,char[] preLN,int n)
    {
        Node root=new Node(pre[0]);
        Stack<Node> st=new Stack<>();
        st.push(root);
        for(int i=1;i<n;i++)
        {
            Node temp=new Node(pre[i]);
            if(st.peek().left==null)
            {
                st.peek().left=temp;
            }
            else if(st.peek().right==null)
            {
                st.peek().right=temp;
                st.pop();
            }
            if(preLN[i]=='N') st.push(temp);
        }
        return root;
    }
    void preorder(Node root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
class abc
{
    public static void main(String[] args) {
        int preorder[]={10,30,20,5,15};
        char preLN[] = {'N', 'N', 'L', 'L', 'L'};
        Tree obj=new Tree();
        obj.preorder(obj.construct(preorder, preLN, preorder.length));
    }
}