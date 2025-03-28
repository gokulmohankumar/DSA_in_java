package LinkedList;
class LinkedList2 {
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

   public void removeDup()
   {
       Node node=head;
       while(node.next!=null)
       {
           if(node.val==node.next.val)
           {
               node.next=node.next.next;
           }else {
               node=node.next;
           }
       }
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
public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList2 list=new LinkedList2();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(5);
        list.insert(5);
        list.display();
        list.removeDup();
        list.display();
    }
}

