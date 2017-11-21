package KosarajuAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Algorithm {

    //private List<Vertex> vertexList;
    private List<Vertex> transposeVertexList;
    private int count = 0;

    public Algorithm () {
        //this.vertexList = new ArrayList<>();
        this.transposeVertexList = new ArrayList<>();
    }

    public void Kosaraju (List<Vertex> vertexList) {

        //this.vertexList = vertexList;
        Graph g = new Graph();
        TopologicalSort ts = new TopologicalSort();
        ts.topologicalOrdering(vertexList);

        this.transposeVertexList = g.getTransposeVertex(vertexList);

        System.out.println(ts.getStack());
        System.out.println(ts.getStack().peek());

        while (!ts.getStack().isEmpty()) {
            Vertex v = ts.getStack().pop();
            Vertex v1 = transposeVertexList.get(v.getId());
            System.out.println("vertex is " + v1 + " " + v1.isVisited());
            if (!v1.isVisited()) {
                System.out.println("calling first dfs");
                dfs(v1);
                count++;
            }
        }

        for (Vertex v: transposeVertexList){
            System.out.println(v + " " + v.getComponentId());
        }
    }

    private void dfs(Vertex v) {
        v.setVisited(true);
        v.setComponentId(count);
        //Vertex newVertex = this.transposeVertexList.get(this.transposeVertexList.indexOf(v));
        for (Vertex vertex: v.getAdjecenVertexes()) {
            vertex = transposeVertexList.get(vertex.getId());
            //System.out.println("vertex is inside recursive " + vertex + " " + vertex.isVisited());
            if (!vertex.isVisited()) {
                System.out.println("calling recurssive dfs on  " + vertex );
                dfs(vertex);
            }

        }
    }


    public int count() {
        return count;
    }
}
