package Dijkastra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class UsingHeap {
    ArrayList<ArrayList<Node>> adj;
    int v;
    UsingHeap(int v){
        adj=new ArrayList<>();
        this.v=v;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }


    void edge(int u,int v, int wt){
        adj.get(u).add(new Node(v, wt));
        adj.get(v).add(new Node(u, wt));
    }
    int[] shortestPath(int src,int v){
        int dis[]=new int[v];
        Arrays.fill(dis, 999);
        dis[src]=0;
        PriorityQueue<Node> pq = new PriorityQueue<Node>(v, new Node());
        pq.add(new Node(src, 0));
        // while(!pq.isEmpty()){
        //     Node node=pq.poll();
        //     for(Node it:adj.get(node.u)){
        //         if(dis[it.u]>dis[node.u]+it.wt){  
        //             dis[it.u]=dis[node.u]+it.wt;
        //             pq.add(it);
        //         }
        //     }
        // }
        while(pq.size() > 0) {
            Node node = pq.poll();
            
            for(Node it: adj.get(node.u)) {
                if(dis[node.u] + it.wt < dis[it.u]) {
                    dis[it.u] = dis[node.u] + it.wt; 
                    pq.add(new Node(it.u, dis[it.u]));
                }
            }
        }


        return dis;
    }
    public static void main(String[] args) {
        UsingHeap obj=new UsingHeap(9);
        obj.edge(0, 1, 4);
        obj.edge(0, 7, 8);
        obj.edge(1, 2, 8);
        obj.edge(1, 7, 11);
        obj.edge(2, 3, 7);
        obj.edge(2, 8, 2);
        obj.edge(2, 5, 4);
        obj.edge(3, 4, 9);
        obj.edge(3, 5, 14);
        obj.edge(4, 5, 10);
        obj.edge(5, 6, 2);
        obj.edge(6, 7, 1);
        obj.edge(6, 8, 6);
        obj.edge(7, 8, 7);
        int res[]=obj.shortestPath( 0, 9);
        for(int it:res)
        System.out.print(it+" ");
    }


}
class Node implements Comparator<Node> {
    int u;int wt;
    Node(int u ,int wt){
        this.u=u;
        this.wt=wt;
    }
    Node() {}
    @Override
    public int compare(Node o1, Node o2) {
        if (o1.wt < o2.wt) 
        return -1; 
    if (o1.wt > o2.wt) 
        return 1; 
    return 0; 

    }
}
