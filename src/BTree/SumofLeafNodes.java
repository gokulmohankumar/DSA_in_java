package BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node_T
{
    int data;
    Node_T left,right;
    public Node_T(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
class BinaryTree
{
    Node_T root;
    public void build_tree()
    {
        Scanner in=new Scanner(System.in);
        int val=in.nextInt();
        if(val==-1)return;
        root= new Node_T(val);
        Queue<Node_T> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node_T cur=q.poll();
            int ld=in.nextInt();
            if(ld!=-1)
            {
                cur.left= new Node_T(ld);
                q.offer(cur.left);
            }
            int rd=in.nextInt();
            if(rd!=-1)
            {
                cur.right= new Node_T(rd);
                q.offer(cur.right);
            }
        }
    }
    public int sumOfLeaves()
    {
        int sum=0;
        if(root==null) return 0;
        Queue<Node_T> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            Node_T cn=q.poll();
            if(cn.left==null && cn.right==null)
            {
                sum+=cn.data;
            }
            if(cn.left!=null)q.offer(cn.left);
            if(cn.right!=null)q.offer(cn.right);
        }
        return sum;
    }
    public int SumbyRecursion(Node_T root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return root.data;
        }
        return SumbyRecursion(root.left)+SumbyRecursion(root.right);
    }

}

public class SumofLeafNodes {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.build_tree();
        System.out.println("Sum of leaves: "+bt.sumOfLeaves());
        System.out.println("Sum by recuresion: "+bt.SumbyRecursion(bt.root));
    }
}
