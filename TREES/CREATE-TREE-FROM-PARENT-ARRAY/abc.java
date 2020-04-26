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
    Node root;
   void createNode(int arr[],int i,Node created[])
   {
       if(created[i]!=null) return;
       created[i]=new Node(i);
       if(arr[i]==-1)
       {
           root=created[i];
           return;
       }
       if(created[arr[i]]==null)
       {
           createNode(arr,arr[i],created);
       }
       Node p=created[arr[i]];
       if(p.left==null)
       p.left=created[i];
       else 
       p.right=created[i];
   }
    public Node createTree(int arr[], int n)
    {
        Node created[]=new Node[n];
        for(int i=0;i<n;i++)
        {
            created[i]=null;
        }
        for(int i=0;i<n;i++)
        {
            createNode(arr,i,created);
        }
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
        int arr[]={-1 ,0 ,0 ,1 ,1 ,3 ,5};
        Tree obj=new Tree();
        Node root=obj.createTree(arr, arr.length);
        obj.inorder(root);
        System.out.println();
    }
}