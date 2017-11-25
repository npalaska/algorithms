package BellmanFord;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex("0"));
        vertexList.add(new Vertex("1"));
        vertexList.add(new Vertex("2"));
        //vertexList.add(new Vertex("3"));
        //vertexList.add(new Vertex("4"));

        List<edge> edgeList = new ArrayList<>();
        edgeList.add(new edge(vertexList.get(0), vertexList.get(1), 1));
        edgeList.add(new edge(vertexList.get(1), vertexList.get(2), -1));
        edgeList.add(new edge(vertexList.get(2), vertexList.get(0), -11));
        //edgeList.add(new edge(vertexList.get(1), vertexList.get(0), -2));
        //edgeList.add(new edge(vertexList.get(2), vertexList.get(1), -3));
        //edgeList.add(new edge(vertexList.get(2), vertexList.get(3), 9));
        //edgeList.add(new edge(vertexList.get(3), vertexList.get(1), 7));
        //edgeList.add(new edge(vertexList.get(4), vertexList.get(0), 6));
        //edgeList.add(new edge(vertexList.get(4), vertexList.get(2), 7));

        Algorithm al = new Algorithm();
        List<Vertex> newVertices = al.bellmanford(vertexList, edgeList, vertexList.get(0));

        for (Vertex v: newVertices) {
            System.out.println(v + "->" + v.getPredecessor());
        }
    }
}
