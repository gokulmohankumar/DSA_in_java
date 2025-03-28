package LinkedList;

import java.util.Scanner;

class DCLL
{
    Node head,tail;
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            tail.next=head;
            head.prev=tail;
        }else
        {
            tail.next=node;
            node.prev=tail;
            tail=node;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void display()
    {
        Node temp=head;
        do
        {
            System.out.print(temp.val+" <-> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("head...");
    }
    public void displayRev()
    {
        Node temp=tail;
        do
        {
            System.out.print(temp.val+" <-> ");
            temp=temp.prev;
        }while(temp!=tail);
        System.out.println("tail..");
    }
    class Node
    {
        int val;
        Node next;
        Node prev;
        public Node(int val)
        {
            this.val=val;
            next=prev=null;
        }
    }
}
public class DoublyCircularLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DCLL dcl=new DCLL();
        while(true)
        {
            int val=in.nextInt();
            if(val==-1)break;
            dcl.insert(val);
        }
        dcl.display();
        dcl.displayRev();
    }
}
