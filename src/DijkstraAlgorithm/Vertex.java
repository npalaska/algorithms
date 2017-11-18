package DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{

    private String name;
    private boolean Visisted;
    private double distance;
    private Vertex predecessor;
    private List<Edge> adjecencyList;

    public Vertex (String name) {
        this.name = name;
        this.distance = Double.MAX_VALUE;
        this.adjecencyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisisted() {
        return Visisted;
    }

    public void setVisisted(boolean visisted) {
        Visisted = visisted;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getAdjecencyList() {
        return adjecencyList;
    }

    public void setAdjecencyList(List<Edge> adjecencyList) {
        this.adjecencyList = adjecencyList;
    }

    public void addAdjecencyList (Edge edge) {
        this.adjecencyList.add(edge);
    }

    public int compareTo(Vertex v) {
        return Double.compare(this.distance, v.distance);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }
}
