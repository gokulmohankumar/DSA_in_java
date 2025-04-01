package BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1
{
    int data;
    Node1 left;
    Node1 right;
    public Node1(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class B_Tree1
{
    Node1 root;

    public void buildtree(String[]str)
    {
        if(str.length==0)return;
        root=new Node1(Integer.parseInt(str[0]));
        Queue<Node1> q=new LinkedList<>();
        q.offer(root);
        int i=1;
        while(!q.isEmpty() && i<str.length)
        {
            Node1 cn=q.poll();
            if(i<str.length)
            {
                int val=Integer.parseInt(str[i]);
                if(val!=-1)
                {
                    cn.left=new Node1(val);
                    q.offer(cn.left);
                }
                i++;
            }
            if(i<str.length)
            {
                int val=Integer.parseInt(str[i]);
                if(val!=-1){
                    cn.right=new Node1(val);
                    q.offer(cn.right);
                }
                i++;
            }
        }
    }
    public void rightView()
    {
        if(root==null)return;
        Queue<Node1>que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {
            int s=que.size();
            for(int i=0;i<s;i++)
            {
                Node1 cur=que.poll();
                if(i==s-1)
                {
                    System.out.print(cur.data+" ");
                }
                if(cur.left!=null)que.offer(cur.left);
                if(cur.right!=null)que.offer(cur.right);
            }
        }
    }
}
public class RightView {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String[]str=s.split(" ");
        B_Tree1 bt=new B_Tree1();
        bt.buildtree(str);
        bt.rightView();
    }
}