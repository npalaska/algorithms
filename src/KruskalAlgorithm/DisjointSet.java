package KruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

// disjoint set support 3 main operations that is `makeset, union and find`

public class DisjointSet {

    private int setCount = 0;
    private List<Node> rootNodes; // representative

    public DisjointSet (List<Vertex> vertexes) {
        this.rootNodes = new ArrayList<>(vertexes.size());
    }

    public int find(Node n) {

        Node cureentNode = n;

        // we need to return the representative of the current node
        while (cureentNode.getParent() != cureentNode) {
            cureentNode = cureentNode.getParent();
        }

        //path compression
        Node rootNode = cureentNode;
        cureentNode = n;
        while (cureentNode != rootNode) {
            Node temp = cureentNode.getParent();
            cureentNode.setParent(rootNode);
            cureentNode = temp;
        }

        return rootNode.getId();
    }

    public void union (Node n1, Node n2) {
        int id1 = find(n1);
        int id2 = find(n2);

        if (id1 == id2) {
            return;
        }

        if (n1.getRank() > n2.getRank()) {
            n2.setParent(n1);
        } else if (n1.getRank() <n2.getRank()) {
            n1.setParent(n2);
        } else {
            n1.setParent(n2);
            n1.setRank(n1.getRank()+1);
        }
        this.setCount--;
    }

    public void Makesets (List<Vertex> vertexLists) {

        for (Vertex v: vertexLists) {
            Node newNode = new Node(rootNodes.size(), 0);
            newNode.setParent(newNode);
            v.setNode(newNode);
            this.rootNodes.add(newNode);
            this.setCount++;

        }
    }
}
