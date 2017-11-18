package DijkstraAlgorithm;

public class Execute {
    public static void main (String[] args) {

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");

        v1.addAdjecencyList(new Edge(v1, v2, 1));
        v1.addAdjecencyList(new Edge(v1, v3, 10));
        v2.addAdjecencyList(new Edge(v2, v3, 1));

        Dijkstra algorithm = new Dijkstra();
        algorithm.computeShortest(v1);

        System.out.println(algorithm.getShortestPathTo(v3));
    }
}
