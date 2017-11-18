package DijkstraAlgorithm;

import CycleDetection.Virtex;

import java.util.*;

public class Dijkstra {

    //This method should calculate minimum distance from source vertex to all other vertexes in the graph
    public void computeShortest (Vertex sourceVertex) {

        sourceVertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while ( !priorityQueue.isEmpty() ) {
            Vertex currentVertex = priorityQueue.poll();

            for (Edge e: currentVertex.getAdjecencyList()) {
                Vertex nextVertex = e.getEndVertex();
                double distance = e.getWeight() + currentVertex.getDistance();
                if (distance < nextVertex.getDistance()) {
                    priorityQueue.remove(nextVertex);
                    nextVertex.setDistance(distance);
                    nextVertex.setPredecessor(currentVertex);
                    priorityQueue.add(nextVertex);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo (Vertex targetVertex) {
        List<Vertex> shortestPath = new ArrayList<>();

        for (Vertex v=targetVertex; v!=null; v=v.getPredecessor()) {
            shortestPath.add(v);
        }

        Collections.reverse(shortestPath);
        return shortestPath;
    }
}
