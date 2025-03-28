package Queue;
class Queue
{
    int n;
    int size=0;
    int[]arr;
    int f=-1;
    int r=-1;
    public Queue(int n)
    {
        this.n=n;
        arr=new int[n];
    }
    public void enqueue(int val)
    {
       if(isFull())
       {
           System.out.println("Queue is full");
           return;
       }
       if(f==-1)f=0;
       r=(r+1)%n;
       arr[r]=val;
       size++;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }else
        {
            int val=arr[f];
            arr[f]=0;
            f=(f+1)%n;
            size--;
            return val;
        }
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return ;
        }
        int i=f;
        while(i!=r) {
            System.out.print(arr[i]+" ");
            i=(i+1)%n;
        }
        System.out.println(arr[r]);
    }
    public boolean isFull()
    {
        return (size>=n);
    }
    public boolean isEmpty()
    {
        return (size<1);
    }
    public int size()
    {
        return size;
    }
    public int peek()
    {
        return arr[f];
    }
}
public class ArrayImplementation {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("peek: "+q.peek());
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("Peek: "+q.peek());
        q.display();
        System.out.println("size: "+q.size());
    }
}
