package FordFulkerson;

public class Edge {

    private Vertex start;
    private Vertex end;
    private double capacity;
    private double flow;

    public Edge (Vertex start, Vertex end, double capacity) {
        this.start = start;
        this.end = end;
        this.capacity = capacity;
        this.flow = 0;
        this.start.addNeighbourVertices(this.end);
    }

    public Vertex getStart() {
        return start;
    }

    public void setStart(Vertex start) {
        this.start = start;
    }

    public Vertex getEnd() {
        return end;
    }

    public void setEnd(Vertex end) {
        this.end = end;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFlow() {
        return flow;
    }

    public void setFlow(double flow) {
        this.flow = flow;
    }

    public double getResidualCapacity() {
        return this.capacity-this.flow;
    }

    public Vertex getOther () {
        return this.end;
    }

}
