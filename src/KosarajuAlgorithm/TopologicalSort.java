package KosarajuAlgorithm;

import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    // We will first do topological sorting and fill the stack accordingly
    private Stack<Vertex> stack;

    public TopologicalSort() {
        this.stack = new Stack<>();
    }

    public void topologicalOrdering(List<Vertex> vertexList) {

        for (Vertex v: vertexList) {
            if (!v.isVisited()) {
                //System.out.println("visiting: " + v);
                v.setVisited(true);
                sort(v);
            }
        }
    }

    private void sort(Vertex vertex) {

        for (Vertex v1: vertex.getAdjecenVertexes()) {
            //System.out.println("adjecent : " + v1);
            if (!v1.isVisited()) {
                //System.out.println("visiting: " + v1);
                v1.setVisited(true);
                sort(v1);
            }
        }
        //System.out.println("Pushing Node: " + vertex);
        stack.push(vertex);
    }

    public Stack<Vertex> getStack() {
        return stack;
    }


}
