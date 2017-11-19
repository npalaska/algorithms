package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {

    private PriorityQueue<Edge> priorityQueue;

    public Algorithm () {
        this.priorityQueue = new PriorityQueue<>();
    }

    public void kruskal (List<Edge> edgeLists, List<Vertex> vertixList) {

        DisjointSet ds = new DisjointSet(vertixList);
        List<Edge> MST = new ArrayList<>();

        ds.Makesets(vertixList);
        priorityQueue.addAll(edgeLists);

        while (!priorityQueue.isEmpty()) {
            Edge removedEdge = priorityQueue.remove();

            Vertex startVertex = removedEdge.getStartVertex();
            Vertex endVertex = removedEdge.getEndVertex();

            if (ds.find(startVertex.getNode()) != ds.find(endVertex.getNode())){
                MST.add(removedEdge);
                ds.union(startVertex.getNode(), endVertex.getNode());
            }
        }
        for (Edge e: MST) {
            System.out.print(""+e.getStartVertex()+""+e.getEndVertex()+"-");
        }
    }


}
