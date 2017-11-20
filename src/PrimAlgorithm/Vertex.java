package PrimAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private List<Edge> adjecencyList;
    private boolean visied;

    public Vertex (String name) {
        this.name = name;
        this.adjecencyList = new ArrayList<>();
    }

    public void addEdge (Edge e) {
        this.adjecencyList.add(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Edge> getAdjecencyList() {
        return adjecencyList;
    }

    public void setAdjecencyList(List<Edge> adjecencyList) {
        this.adjecencyList = adjecencyList;
    }

    public boolean isVisied() {
        return visied;
    }

    public void setVisied(boolean visied) {
        this.visied = visied;
    }

    @Override
    public String toString() {
        return name;
    }
}

