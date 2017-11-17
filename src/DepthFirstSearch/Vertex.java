package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbouringNodes;

    public Vertex(int data){
        this.data = data;
        this.neighbouringNodes = new ArrayList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbouringNodes() {
        return neighbouringNodes;
    }

    public void setNeighbouringNodes(List<Vertex> neighbouringNodes) {
        this.neighbouringNodes = neighbouringNodes;
    }

    public void addNeighbouringNodes(Vertex node){
        this.neighbouringNodes.add(node);
    }

    @Override
    public String toString() {
        return "Virtex{" +
                "data=" + data +
                '}';
    }

}