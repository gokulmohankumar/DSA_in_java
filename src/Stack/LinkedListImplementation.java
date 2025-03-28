package Stack;

class Stack
{
    int n=0;
    Node top;
    public void push(int val)
    {
        if(top==null)
        {
            top=new Node(val,null);
        }else
        {
            top=new Node(val,top);
        }
        n++;
    }
    public int pop()
    {
        if(top==null)
        {
            System.out.println("Stack is underflow");
        }
        int val=top.val;
        top=top.next;
        n--;
        return val;
    }
    public int peek()
    {
        if(top==null)
        {
            return -1;
        }
        return top.val;
    }
    public int size()
    {
        return n;
    }
    public void display()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    class Node
    {
        int val;
        Node next;
        public Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
}
public class LinkedListImplementation {
    public static void main(String[] args) {
       Stack st=new Stack();
       st.push(5);
       st.push(6);
       st.push(7);
       st.push(8);
       st.push(9);
       st.display();
       st.pop();
       st.push(10);
       System.out.println("peek element: "+st.peek());
       st.pop();
       System.out.println("peek element: "+st.peek());
       st.display();
       System.out.println("size: "+st.size());
    }
}
