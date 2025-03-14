package _13_LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Solution1 list=new Solution1();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        //delete duplicates function is called inside the display function
        list.display();
    }
}
class Solution1 {
    ListNode head,tail;
    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val=val;
        }
    }
    public void insert(int val)
    {
        ListNode node=new ListNode(val);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        tail.next=node;
        tail=node;
    }
    public void display()
    {
        deleteDuplicates(head);
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null)
        {
            if(temp.val==temp.next.val)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }
}