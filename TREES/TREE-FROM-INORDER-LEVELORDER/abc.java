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
    int[] newLevelOrder(int[] ino,int[] level,int start,int end)
    {
        int res[]=new int[end-start+1];
        int x=0;
        for(int i=0;i<level.length;i++)
        {
            for(int j=start;j<=end;j++)
            {
                if(level[i]==ino[j])
                res[x++]=level[i];
            }
        }
        return res;
    }
    Node construct(int[] ino,int[] level,int start,int end)
    {
        if(start>end) return null;
        Node root=new Node(level[0]);
        int inIndex=-1;
        for(int i=start;i<=end;i++)
        {
            if(ino[i]==root.data)
            {
                inIndex=i;
                break;
            }
        }
        int leftOrder[]=newLevelOrder(ino, level, start, inIndex-1);
        int rightOrder[]=newLevelOrder(ino, level, inIndex+1, end);
        root.left=construct(ino, leftOrder, start, inIndex-1);
        root.right=construct(ino, rightOrder, inIndex+1,end);
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
        int ino[]={3 ,1 ,4 ,0 ,5 ,2 ,6};
        int level[]={0 ,1 ,2 ,3 ,4 ,5 ,6};
        Tree obj=new Tree();
        obj.preorder(obj.construct(ino, level, 0, ino.length-1));

    }
}