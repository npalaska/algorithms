package PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {

    private PriorityQueue<Edge> priorityQueue;
    private List<Edge> MST;
    private double fullCost = 0;
    private int totalSize;
    private int count = 0;
    private List<Vertex> unvisitedVertices;

    public Algorithm (List<Vertex> vertexLists) {

        this.unvisitedVertices = vertexLists;
        this.priorityQueue = new PriorityQueue<>();
        this.MST = new ArrayList<>();
    }

    public void minimumSpanning(Vertex v) {
        unvisitedVertices.remove(v);

        while (!unvisitedVertices.isEmpty()) {
            v.setVisied(true);

            for (Edge edge : v.getAdjecencyList()) {
                if (!edge.getEndVertex().isVisied()) {
                    priorityQueue.add(edge);
                }
            }

            Edge e = priorityQueue.remove();
            this.MST.add(e);
            this.fullCost += e.getWeight();
            count++;
            unvisitedVertices.remove(e.getEndVertex());
        }

    }

    public List<Edge> getMST() {
        return MST;
    }

    public double getFullCost() {
        return this.fullCost;
    }
}
