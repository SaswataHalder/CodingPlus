import java.util.*;
class Graph{
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }    

    void BFS(int s){
        
        boolean visited[] =new boolean[V];
        Queue<Integer> q=new PriorityQueue<Integer>();

        visited[s]=true;
        q.add(s);

        while(q.size()!=0){
            s=q.poll();
            System.out.print(s+" ");

            for(int i: adj[s]){
                int n=i;
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }
}


class MainClass{
    public static void main(String[] args){
        Graph g= new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.BFS(2);
    }
}