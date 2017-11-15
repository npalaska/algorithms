package BreadthFirstSearch;

public class App {
    public static void main (String[] args) {
        Virtex v1 = new Virtex(1);
        Virtex v2 = new Virtex(2);
        Virtex v3 = new Virtex(3);
        Virtex v4 = new Virtex(4);
        Virtex v5 = new Virtex(5);

        v1.addNeighbouringNodes(v2);
        v1.addNeighbouringNodes(v4);
        v2.addNeighbouringNodes(v3);
        v1.addNeighbouringNodes(v5);

        BFS bfs = new BFS();
        bfs.bfs(v1);

    }
}