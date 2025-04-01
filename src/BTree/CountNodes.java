package BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TNode
{
    int data;
    TNode left,right;
    public TNode(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
class Btree
{
    TNode root;
    public void build1()
    {
        Scanner in=new Scanner(System.in);
        int val=in.nextInt();
        if(val==-1)return;
        root=new TNode(val);
        Queue<TNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TNode cur=q.poll();
            int ld=in.nextInt();
            if(ld!=-1)
            {
                cur.left=new TNode(ld);
                q.offer(cur.left);
            }
            int rd=in.nextInt();
            if(rd!=-1)
            {
                cur.right=new TNode(rd);
                q.offer(cur.right);
            }
        }
    }
    public int Count(TNode root)
    {
        if(root==null)return 0;
        return 1+Count(root.left)+Count(root.right);
    }
    public int findHeight(TNode root)
    {
        if(root==null)return 0;
        return 1+Math.max(findHeight(root.left),findHeight(root.right));
    }
}
public class CountNodes {
    public static void main(String[] args) {
        Btree bt=new Btree();
        bt.build1();
        System.out.println("Number of nodes: "+bt.Count(bt.root));
        System.out.println("height of tree: "+ bt.findHeight(bt.root));
    }
}
