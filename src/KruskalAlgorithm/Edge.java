package KruskalAlgorithm;

import java.util.Collections;

public class Edge implements Comparable<Edge>{

    private Vertex startVertex;
    private Vertex endVertex;
    private double weight;

    public Edge (Vertex start, Vertex end, double weight) {
        this.startVertex = start;
        this.endVertex = end;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int compareTo(Edge e){
        return Double.compare(this.weight, e.getWeight());
    }
}
