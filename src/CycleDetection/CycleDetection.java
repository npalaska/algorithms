package CycleDetection;

import java.util.List;

public class CycleDetection {

    //if we want to detect multiple cycles in a graph
    public void detectCycle (List<Virtex> virtexes) {
        for (Virtex v: virtexes) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    public void dfs (Virtex virtex) {

        virtex.setBeingVisited(true);

        for (Virtex v: virtex.getNeighbouringNodes()) {
            if (v.isBeingVisited()) {
                System.out.println("backword node at: " + v.toString());
                return;
            }

            if (!v.isVisited()) {
                System.out.println("Visiting: " + v.toString());
                v.setVisited(true);
                dfs(v);
            }
        }
    }
}





