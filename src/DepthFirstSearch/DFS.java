package DepthFirstSearch;

import java.util.Stack;

public class DFS {


    public void dfs (Vertex vertex) {

        Stack<Vertex> stack = new Stack<>();

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
