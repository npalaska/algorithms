package BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class Algorithm {

    private List<Vertex> vertices;
    private List<edge> edges;

    public Algorithm () {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    public List<Vertex> bellmanford (List<Vertex> vertexList, List<edge> edgelist, Vertex source) {

        this.edges = edgelist;
        this.vertices = vertexList;
        vertices.get(vertices.indexOf(source)).setDiistance(0);

        for (Vertex v: vertices) {
            for (edge e: edges) {
                Vertex edgeStart = e.getStart();
                Vertex edgeEnd = e.getEnd();
                if ((edgeStart.getDiistance() + e.getWeight()) < edgeEnd.getDiistance()){
                    edgeEnd.setDiistance(edgeStart.getDiistance() + e.getWeight());
                    vertices.get(vertices.indexOf(edgeEnd)).setPredecessor(vertices.get(vertices.indexOf(edgeStart)));
                }
            }
        }

        for (edge e: edges) {
            Vertex edgeStart = e.getStart();
            Vertex edgeEnd = e.getEnd();
            if ((edgeStart.getDiistance() + e.getWeight()) < edgeEnd.getDiistance()){
                System.out.println("negative weight cycle detected");
                return new ArrayList<>();
            }
        }

        return vertices;
    }
}
