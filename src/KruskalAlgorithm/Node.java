package KruskalAlgorithm;

public class Node {

    private Double rank;
    private Node parent;
    private int id;

    public Node (int id, double rank) {
        this.id = id;
        //this.parent = parent;
        this.rank = rank;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
