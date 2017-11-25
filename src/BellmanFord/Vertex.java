package BellmanFord;

public class Vertex {

    private String name;
    private double diistance;
    private boolean visited;
    private Vertex predecessor;

    public Vertex (String name) {
        this.name = name;
        this.diistance = Double.MAX_VALUE;
        this.visited = false;
        this.predecessor = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiistance() {
        return diistance;
    }

    public void setDiistance(double diistance) {
        this.diistance = diistance;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public String toString() {
        return name;
    }
}
