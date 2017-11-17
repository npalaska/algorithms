package DepthFirstSearch;

import java.util.Stack;

public class DFS {

    Stack<Vertex> stack;

    public DFS () {
        this.stack = new Stack<>();
    }

    public void dfs (Vertex vertex) {

        stack.add(vertex);
        vertex.setVisited(true);

        System.out.println("current node: " + vertex);
        while (!stack.isEmpty()) {
            Vertex currentVertex = stack.pop();
            for (Vertex v: currentVertex.getNeighbouringNodes()){
                    dfs(v);
            }
        }
    }


}
