package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String args[]) {

        ArrayList <ArrayList< Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        S1 sl = new S1();
        ArrayList < Integer > ans = sl.bfsOfGraph(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
class S1
{
    public ArrayList<Integer> bfsOfGraph(int n,ArrayList<ArrayList<Integer>>adj)
    {
        boolean[]vis=new boolean[n];
        ArrayList<Integer> bfs=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty())
        {
            int node= q.poll();
            bfs.add(node);

            for(int neighbour: adj.get(node))
            {
                if(!vis[neighbour])
                {
                    vis[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
