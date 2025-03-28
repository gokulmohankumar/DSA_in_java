package Queue;
class LQueue
{
    int size=0;
    Node front,rear;
    public void enqueue(int val)
    {
        Node node=new Node(val);
        if(front==null)
        {
            rear=node;
            front=node;
        }else
        {
            rear.next=node;
            rear=node;
        }
        size++;
    }
    public int dequeue()
    {
        int val=-1;
        if(front==null)
        {
            System.out.println("Queue is empty");
        }else {
            val= front.val;
            front=front.next;
            size--;
        }
        return val;
    }
    public void display()
    {
        Node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public int peek()
    {
        return front.val;
    }
    public int size()
    {
        return size;
    }
   class Node
   {
       int val;
       Node next;
       public Node(int val)
       {
           this.val=val;
           this.next=null;
       }
   }
}
public class ListImplementation {
    public static void main(String[] args) {
        LQueue q=new LQueue();
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
