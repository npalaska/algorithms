package KosarajuAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Cloneable{

    private int id;
    private String name;
    private boolean visited;
    private List<Vertex> adjecenVertexes;
    private int componentId;

    public Vertex (int id, String name) {
        this.id = id;
        this.name = name;
        this.adjecenVertexes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjecenVertexes() {
        return adjecenVertexes;
    }

    public void setAdjecenVertexes(List<Vertex> adjecentVertex) {
        this.adjecenVertexes = adjecentVertex;
    }

    public void addAdjecentVertex(Vertex e) {
        this.adjecenVertexes.add(e);
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone(int id, String name) {
        try {
            Vertex v = new Vertex(id, name);
            return v;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
