package DepthFirstSearch;

public class App {
    public static void main (String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighbouringNodes(v2);
        v1.addNeighbouringNodes(v4);
        v2.addNeighbouringNodes(v3);
        v3.addNeighbouringNodes(v5);

        DFS bfs = new DFS();
        bfs.dfs(v1);

    }
}