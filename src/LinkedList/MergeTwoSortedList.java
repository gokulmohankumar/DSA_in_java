package LinkedList;

class LinkedList3 {
    Node head;

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) head = node;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public static LinkedList3 mergeLists(LinkedList3 list1,LinkedList3 list2) {
        LinkedList3 ans=new LinkedList3();
        Node f=list1.head;
        Node s=list2.head;
        while(f!=null && s!=null)
        {
            if(f.val<s.val)
            {
                ans.insert(f.val);
                f=f.next;
            }else {
                ans.insert(s.val);
                s=s.next;
            }
        }
        while(f!=null)
        {
            ans.insert(f.val);
            f=f.next;
        }
        while(s!=null)
        {
            ans.insert(s.val);
            s=s.next;
        }
        return ans;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
public class MergeTwoSortedList {
    public static void main(String[] args) {
        LinkedList3 list1 =new LinkedList3();
        list1.insert(1);
        list1.insert(2);
        list1.insert(4);
        list1.display();
        LinkedList3 list2=new LinkedList3();
        list2.insert(1);
        list2.insert(3);
        list2.insert(4);
        list2.display();

        LinkedList3 ans=LinkedList3.mergeLists(list1,list2);
        ans.display();
    }
}
