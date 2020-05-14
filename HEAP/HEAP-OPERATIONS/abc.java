class MinHeap
{
    int size,capacity;
    int harr[];
    MinHeap(int c)
    {
        size=0;
        capacity=c;
        harr=new int[capacity];
    }
    int left(int i)
    {
        return 2*i+1;
    }
    int right(int i)
    {
        return 2*i+2;
    }
    int parent(int i)
    {
        return (i-1)/2;
    }
    void swap(int[] harr,int i,int j)
    {
        int t=harr[i];
        harr[i]=harr[j];
        harr[j]=t;
    }
    void insert(int k)
    {
        if(size==capacity) return;
        size++;
        harr[size-1]=k;
        for(int i=size-1;i!=0 && harr[parent(i)]>harr[i];)
        {
            swap(harr, i, parent(i));
            i=parent(i);
        }
    }
    void MinHeapify(int i)
    {
        int l=left(i),r=right(i),smallest=i;
        if(l<size && harr[l]<harr[i]) smallest=l;
        if(r<size && harr[r]<harr[smallest]) smallest=r;
        if(smallest!=i)
        {
            swap(harr, i, smallest);
            MinHeapify(smallest);
        }
    }
    int extractMin()
    {
        if(size==0) return -1;
        if(size==1)
        {
            size--;
            return harr[0];
        }
        swap(harr, 0, size-1);
        size--;
        MinHeapify(0);
        return harr[size];
    }
    void delete(int i)
    {
        if(i>size-1) return;
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }
    void decreaseKey(int i,int x)
    {
        harr[i]=x;
        while(i!=0 && harr[parent(i)]>harr[i])
        {
            swap(harr, i, parent(i));
            i=parent(i);
        }
    }
}
class abc
{
    public static void main(String[] args) {
        MinHeap obj=new MinHeap(5);
        obj.insert(1);
        obj.insert(2);
        obj.insert(4);
        System.out.println(obj.extractMin());
        obj.delete(1);
        System.out.println(obj.extractMin());
    }
}
