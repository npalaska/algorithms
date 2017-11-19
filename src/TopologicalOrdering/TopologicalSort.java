package TopologicalOrdering;

import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    private Stack<Vertex> stack;

    public TopologicalSort () {
        this.stack = new Stack<>();
    }

    public void sort(List<Vertex> vertexList) {

        for (Vertex v: vertexList) {
            if (!v.isVisited()) {
                v.setVisited(true);
                algorithm(v);
            }
        }
    }

    private void algorithm(Vertex vertex) {

        for (Vertex v: vertex.getNeighbourList()) {

            if (!v.isVisited()) {
                v.setVisited(true);
                System.out.println("algorithm called on: "+ v);
                algorithm(v);
            }
        }

        System.out.println("Pushing: " + vertex);
        stack.push(vertex);
    }

    public Stack<Vertex> getSTack() {
        return stack;
    }
}
