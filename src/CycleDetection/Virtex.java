package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class Virtex {

    private String data;
    private boolean visited;
    private boolean beingVisited;
    private List<Virtex> neighbouringNodes;

    public Virtex(String data){
        this.data = data;
        this.neighbouringNodes = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
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

