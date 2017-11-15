package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Virtex {

    private int data;
    private boolean visited;
    private List<Virtex> neighbouringNodes;

    public Virtex(int data){
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

    public List<Virtex> getNeighbouringNodes() {
        return neighbouringNodes;
    }

    public void setNeighbouringNodes(List<Virtex> neighbouringNodes) {
        this.neighbouringNodes = neighbouringNodes;
    }

    public void addNeighbouringNodes(Virtex node){
        this.neighbouringNodes.add(node);
    }

    @Override
    public String toString() {
        return "Virtex{" +
                "data=" + data +
                '}';
    }

}
