package KosarajuAlgorithm;

public class Edge {

    private Vertex startVertex;
    private Vertex endVertex;

    //we dont need to consider weights in strongly connected component

    public Edge (Vertex start, Vertex end) {
        this.endVertex = end;
        this.startVertex = start;
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
}
