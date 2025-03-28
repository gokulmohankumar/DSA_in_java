package LinkedList;

class Node1
{
    int val;
    Node1 next;
    public Node1(int val)
    {
        this.val=val;
        this.next=null;
    }
}
class LL
{
    Node1 head;

    public boolean loopDetect()
    {
        Node1 slow=head;
        Node1 fast=head;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}
public class CycleDetection {
    public static void main(String[] args) {
        LL list=new LL();
        list.head=new Node1(3);
        list.head.next=new Node1(4);
        list.head.next.next=new Node1(5);
        list.head.next.next.next=new Node1(6);
        list.head.next.next.next.next=list.head.next;

        System.out.println(list.loopDetect());
    }
}
