package DijkstraAlgorithm;

public class Edge {

    private Vertex startVertex;
    private Vertex endVertex;
    private int weight;

    public Edge (Vertex start, Vertex end, int weight) {
        this.endVertex = end;
        this.startVertex= start;
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getEndVertex() {
        return endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
