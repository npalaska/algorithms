package FordFulkerson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Algorithm {

    private List<Edge> currentPath;
    private Queue<Vertex> queue;
    private double maxFlow;

    public Algorithm () {
        this.currentPath = new ArrayList<>();
        this.queue = new LinkedList<>();
    }

    public double fordFulkerson (List<Vertex> vertices, List<Edge> edges, Vertex source, Vertex target) {

        while (hasAugmentedPath(vertices, edges, source, target)) {
            System.out.println("inside has fordfulkerson loop");

            //get minimum weight from current path
            double min = Double.MAX_VALUE;

            for(Edge e: currentPath) {
                if (min>e.getResidualCapacity()) {
                    min = e.getResidualCapacity();
                }
            }

            for(Edge e: currentPath) {
                e.setFlow(min);
            }

            currentPath.clear();
        }

        for (Edge e: source.getNeighbourEdges()) {
            this.maxFlow += e.getFlow();
        }

        return this.maxFlow;
    }

    private boolean hasAugmentedPath(List<Vertex> vertices, List<Edge> edges, Vertex source, Vertex target) {

        //Do breadth first search
        System.out.println("inside has augmentedpath loop");
        queue.add(source);
        source.setVisited(true);

        while (!queue.isEmpty()) {
            System.out.println("checking if queue is empty");
            Vertex actualVertext = queue.remove();
            List<Edge> adjecentEdges = actualVertext.getNeighbourEdges();

            for (Edge e: actualVertext.getNeighbourEdges()) {
                Vertex vertexEnd = e.getEnd();
                if (!vertexEnd.isVisited() && e.getResidualCapacity()>0) {
                    vertexEnd.setVisited(true);
                    queue.add(vertexEnd);
                    vertexEnd.setParent(actualVertext);
                }
            }
        }

        //backtrack the path from target to source
        Vertex currentVertex = target;
        for (;;) {
            System.out.println("setting up current path");
            Vertex tempParent = currentVertex.getParent();
            if (tempParent != null) {
                this.currentPath.add(getEdge(edges, tempParent, currentVertex
                ));
                if (tempParent == source) {
                    break;
                }
                currentVertex = tempParent;
            }
            else {
                return false;
            }
        }

        for (Vertex v : vertices) {
            v.setParent(null);
            v.setVisited(false);
        }

        return true;
    }

    private Edge getEdge (List<Edge> edges, Vertex start, Vertex end) {
        for (Edge e: edges) {
            if (e.getStart() == start && e.getEnd() == end) {
                return e;
            }
        }
        System.out.println("No edge between Vertex " + start + "and vertex " + end);
        return null;
    }


}
