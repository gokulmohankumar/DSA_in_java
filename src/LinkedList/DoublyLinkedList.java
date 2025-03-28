package LinkedList;

import java.util.Scanner;

class DLL
{
    Node head,tail;
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
        }else
        {
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" <-> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void displayRev()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" <-> ");
            temp=temp.prev;
        }
        System.out.println("Null");
    }
    class Node
    {
        int val;
        Node next;
        Node prev;
        public Node(int val)
        {
            this.val=val;
        }
    }

}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    DLL dl=new DLL();
    while(true)
    {
        int val=in.nextInt();
        if(val==-1)break;
        dl.insert(val);
    }
    dl.display();
    dl.displayRev();
    }
}
