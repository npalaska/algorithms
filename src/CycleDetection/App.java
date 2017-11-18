package CycleDetection;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main (String[] args) {

        Virtex v1 = new Virtex("1");
        Virtex v2 = new Virtex("2");
        Virtex v3 = new Virtex("3");
        Virtex v4 = new Virtex("4");
        Virtex v5 = new Virtex("5");
        Virtex v6 = new Virtex("6");

        v1.addNeighbouringNodes(v2);
        v2.addNeighbouringNodes(v3);
        v3.addNeighbouringNodes(v1);
        v4.addNeighbouringNodes(v1);
        v4.addNeighbouringNodes(v5);
        v5.addNeighbouringNodes(v6);
        v6.addNeighbouringNodes(v4);

        List<Virtex> virtexList = new ArrayList<Virtex>();
        virtexList.add(v1);
        virtexList.add(v2);
        virtexList.add(v3);
        virtexList.add(v4);
        virtexList.add(v5);
        virtexList.add(v6);

        CycleDetection cd = new CycleDetection();
        //cd.detectCycle(virtexList);
        cd.dfs(v4);

    }

}
