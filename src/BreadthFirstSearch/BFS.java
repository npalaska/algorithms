package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private Virtex root;

    public void bfs (Virtex root) {

        Queue<Virtex> queue = new LinkedList<>();
        root.setVisited(true);

        queue.add(root);

        while (!queue.isEmpty()) {

            Virtex actualVertext = queue.remove();

            System.out.println(actualVertext);
            for (Virtex v: actualVertext.getNeighbouringNodes()){
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
