package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node
{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class BS
{
    Node root=null;
    public Node insert(Node root , int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(data<root.data)
        {
            root.left=insert(root.left,data);
        }
        else
        {
            root.right=insert(root.right,data);
        }
        return root;
    }
    public boolean search(Node root, int key)
    {
        if(root==null)
        {
            return false;
        }
        if(key==root.data)return true;
        if(key<root.data)
        {
            return search(root.left,key);
        }
        return search(root.right,key);
    }
    public void levelOrder(Node root)
    {
        if (root==null)
        {
            System.out.println("Tree is empty");
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            for(int i=0;i<s;i++)
            {
                Node cur=q.poll();
                if(cur==null)
                {
                    System.out.print("-1 ");
                }
                else
                {
                    System.out.print(cur.data+" ");
                    q.offer(cur.left);
                    q.offer(cur.right);
                }
            }
        }
    }
    public int findLowestCommonAncestor(Node root,int n1, int n2)
    {
        if(root==null)return 0;
        if(n1<root.data && n2<root.data)
        {
            return findLowestCommonAncestor(root.left,n1,n2);
        }
        if(n1>root.data && n2>root.data)
        {
            return findLowestCommonAncestor(root.right,n1,n2);
        }
        return root.data;
    }
}
public class BSTree {
    public static void main(String[] args) {
        BS bst=new BS();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i < n; i++) {
            int val=in.nextInt();
            bst.root=bst.insert(bst.root,val);
        }
        bst.levelOrder(bst.root);
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println("common ancestor: "+ bst.findLowestCommonAncestor(bst.root,n1,n2));
    }
}
