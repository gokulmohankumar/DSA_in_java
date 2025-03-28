package LinkedList;

import java.util.Scanner;

class SL
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
    public void swapNode()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            int swap=temp.val;
            temp.val=temp.next.val;
            temp.next.val=swap;
            temp=temp.next.next;
        }
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
public class SwapNodesinSL {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        SL list=new SL();
        while(true)
        {
            int val=in.nextInt();
            if(val==-1)break;
            list.insert(val);
        }
        System.out.println("Before swapping: ");
        list.display();
        list.swapNode();
        System.out.println("After swapping: ");
        list.display();
    }
}
