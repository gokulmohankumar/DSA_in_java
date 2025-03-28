package LinkedList;

import java.util.Scanner;

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
class SCLL
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
        }
        else {
            tail.next=node;
            tail=node;
            tail.next=head;
        }
    }
    public void display()
    {
        Node temp=head;
        do{
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.print("head...");
    }
}
public class CircularLinkedList  {
    public static void main(String[] args) {
        SCLL cl=new SCLL();
        Scanner in=new Scanner(System.in);
        while(true)
        {
            int val=in.nextInt();
            if(val==-1)break;
            cl.insert(val);
        }
        cl.display();
    }
}
