package LinkedList;
class DLlist
{
    class Node
    {
        int val;
        Node next,prev;
        public Node(int val)
        {
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }
    Node head,tail;
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else {
            node.prev=tail;
            tail.next=node;
            tail=node;
        }
    }
    public void displayRev()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" <=> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }
}
public class PrintRevinDL {
    public static void main(String[] args) {
         DLlist dl=new DLlist();
         dl.insert(1);
         dl.insert(2);
         dl.insert(3);
         dl.insert(4);
         dl.insert(5);
         dl.displayRev();
    }
}
