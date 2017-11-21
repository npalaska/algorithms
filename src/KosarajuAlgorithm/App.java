package KosarajuAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex(0, "a"));
        vertexList.add(new Vertex(1, "b"));
        vertexList.add(new Vertex(2, "c"));
        vertexList.add(new Vertex(3, "d"));
        vertexList.add(new Vertex(4, "e"));
        vertexList.add(new Vertex(5, "f"));
        vertexList.add(new Vertex(6, "g"));
        vertexList.add(new Vertex(7, "h"));

        vertexList.get(0).addAdjecentVertex(vertexList.get(1));

        vertexList.get(1).addAdjecentVertex(vertexList.get(2));
        vertexList.get(1).addAdjecentVertex(vertexList.get(4));
        vertexList.get(1).addAdjecentVertex(vertexList.get(5));

        vertexList.get(2).addAdjecentVertex(vertexList.get(3));
        vertexList.get(2).addAdjecentVertex(vertexList.get(6));

        vertexList.get(3).addAdjecentVertex(vertexList.get(2));
        vertexList.get(3).addAdjecentVertex(vertexList.get(7));

        vertexList.get(4).addAdjecentVertex(vertexList.get(0));
        vertexList.get(4).addAdjecentVertex(vertexList.get(5));

        vertexList.get(5).addAdjecentVertex(vertexList.get(6));

        vertexList.get(6).addAdjecentVertex(vertexList.get(5));

        vertexList.get(7).addAdjecentVertex(vertexList.get(3));
        vertexList.get(7).addAdjecentVertex(vertexList.get(6));


        Algorithm al = new Algorithm();
        al.Kosaraju(vertexList);
        System.out.println(al.count());

    }
}
