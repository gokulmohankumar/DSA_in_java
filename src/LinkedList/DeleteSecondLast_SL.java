package LinkedList;

import java.util.Scanner;

class SinglyList
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
    public boolean deleteSecondlast()
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        if(head.next.next==null)
        {
            head=head.next;
            return true;
        }
        Node prev=null;
        Node temp=head;
        while(temp.next.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return true;
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
public class DeleteSecondLast_SL {
    public static void main(String[] args) {
        SinglyList list=new SinglyList();
        Scanner in = new Scanner(System.in);
        while (true)
        {
            int val=in.nextInt();
            if(val==-1)break;
            list.insert(val);
        }
        list.display();
        System.out.println("Deletion of second last element ......");
        if(list.deleteSecondlast())
        {
            list.display();
        }
        else
        {
            System.out.println("Deletion of second last is not possible in this list.");
        }
    }
}
