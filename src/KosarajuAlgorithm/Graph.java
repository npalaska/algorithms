package KosarajuAlgorithm;

import java.util.*;

public class Graph {

    private List<Vertex> transposeVertex;

    public Graph() {
        this.transposeVertex = new ArrayList<>();
    }

    public List<Vertex> getTransposeVertex(List<Vertex> vertexList) {
        List<Vertex> transposeList = new ArrayList<>();

        for (Vertex v: vertexList) {
            transposeList.add((Vertex) v.clone(v.getId(), v.getName()));
            //transposeList.get(transposeList.indexOf(v)).setAdjecenVertexes(new ArrayList<>());
        }

        for (Vertex v: vertexList) {
            //System.out.println("from original vertexList "  + v.getAdjecenVertexes());
        }
        for (Vertex v: transposeList) {
            //System.out.println("from newly created vertex list "+ v.getAdjecenVertexes());
        }

        for (Vertex v: vertexList) {
            for (Vertex v1: v.getAdjecenVertexes()) {
                transposeList.get(v1.getId()).addAdjecentVertex(v);
            }
        }
        for (Vertex v: transposeList) {
            System.out.println("after updating transpose list " + v.isVisited() + " " + v.getAdjecenVertexes());
        }
        return transposeList;
    }
}
