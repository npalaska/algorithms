package FordFulkerson;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String[] args) {

        Vertex vertex0 = new Vertex( "s");
        Vertex vertex1 = new Vertex( "A");
        Vertex vertex2 = new Vertex( "B");
        Vertex vertex3 = new Vertex( "t");

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(vertex0);
        vertexList.add(vertex1);
        vertexList.add(vertex2);
        vertexList.add(vertex3);

        Edge edge0 = new Edge(vertex0, vertex1, 4);
        Edge edge1 = new Edge(vertex0, vertex2, 2);
        Edge edge2 = new Edge(vertex1, vertex3, 3);
        Edge edge3 = new Edge(vertex2, vertex3, 4);

        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(edge0);
        edgeList.add(edge1);
        edgeList.add(edge2);
        edgeList.add(edge3);

        vertex0.addNeighbourEdges(edge0);
        vertex0.addNeighbourEdges(edge1);
        vertex1.addNeighbourEdges(edge2);
        vertex2.addNeighbourEdges(edge3);

        Algorithm al = new Algorithm();
        System.out.println(al.fordFulkerson(vertexList, edgeList, vertex0, vertex3));
    }
}
