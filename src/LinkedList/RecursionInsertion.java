package LinkedList;
class LinkedList1
{
    Node head;
    int size=0;
    public void insertRec(int ind,int val) {
        head=insertByRecursion(ind,val,head);
    }
    public Node insertByRecursion(int ind,int val,Node node)
    {
        if(ind==0)
        {
            Node newNode=new Node(val,node);
            size++;
            return newNode;
        }
        node.next=insertByRecursion(ind-1,val,node.next);
        return node;
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
public class RecursionInsertion {
    public static void main(String[] args) {
        LinkedList1 list=new LinkedList1();
        list.insertRec(0,1);
        list.insertRec(1,2);
        list.insertRec(2,3);
        list.insertRec(1,5);
        list.display();

    }
}
