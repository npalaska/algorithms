package FordFulkerson;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighbourVertices;
    private List<Edge> neighbourEdges;
    private Vertex parent;

    public Vertex (String name) {
        this.name = name;
        this.visited = false;
        this.neighbourVertices = new ArrayList<>();
        this.neighbourEdges = new ArrayList<>();
        this.parent = null;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbourVerteces() {
        return neighbourVertices;
    }

    public void setNeighbourVerteces(List<Vertex> neighbourVerteces) {
        this.neighbourVertices = neighbourVerteces;
    }

    public void addNeighbourVertices(Vertex addVertex) {
        this.neighbourVertices.add(addVertex);
    }

    public List<Edge> getNeighbourEdges() {
        return neighbourEdges;
    }

    public void addNeighbourEdges(Edge edge) {
        this.neighbourEdges.add(edge);
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return name;
    }
}
