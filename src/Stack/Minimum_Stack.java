package Stack;

class Min_Stack
{
    Node head;
    public void push(int val)
    {
        if(head==null)
        {
            head=new Node(val,val);
        }else {
            head=new Node(val,Math.min(head.min,val),head);
        }
    }
    public int pop()
    {
        int data=head.val;
        head=head.next;
        return data;
    }
    public int top()
    {
        return head.val;
    }
    public int getMin()
    {
        return head.min;
    }
    class Node
    {
        int val;
        int min;
        Node next;
        public Node(int val,int min)
        {
            this.val=val;
            this.min=min;
        }
        public Node(int val,int min,Node next)
        {
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
}
public class Minimum_Stack {
    public static void main(String[] args) {
        Min_Stack ms=new Min_Stack();
        ms.push(-2);
        ms.push(0);
        ms.push(-3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
}
