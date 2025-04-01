package LinkedList;

import java.util.Scanner;

class Llist
{
    class Node
    {
        int val;
        Node next;
        public Node(int val) {
            this.val=val;
            this.next=null;
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
            tail.next=node;
            tail=node;
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
    public  void deleteKth(int k, Node head)
    {
        int c=1;
        Node temp=head;
        while( temp!=null && temp.next!=null)
        {
            if(c+1==k)
            {
                temp.next=temp.next.next;
                c=0;
            }
            else {
                c++;
                temp=temp.next;
            }
        }
    }
}
public class DeleteKthNode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Llist list=new Llist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        int k=3;
        list.display();
        list.deleteKth(k,list.head);
        list.display();
    }
}
