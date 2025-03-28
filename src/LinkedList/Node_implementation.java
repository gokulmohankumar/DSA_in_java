package LinkedList;

class LinkedList
{
    Node head;
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)head=node;
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public void insertAtbeg(int val)
    {
        head=new Node(val,head);
    }
    public void insertAtpos(int ind,int val)
    {
        Node node=new Node(val);
        Node temp=head;
        while(ind>1)
        {
            temp=temp.next;
            ind--;
        }
        Node After=temp.next;
        temp.next=node;
        node.next=After;
    }
    public void display()
    {
        Node temp=head;
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
        public Node(int val)
        {
            this.val =val;
            this.next=null;
        }
        public Node(int val,Node next)
        {
            this.val =val;
            this.next=next;
        }
    }
}
public class Node_implementation {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtbeg(5);
        list.insertAtbeg(6);
        list.insert(7);
        list.insert(8);
        list.insertAtpos(2,9);
        list.insertAtpos(3,10);
        list.display();
    }
}
