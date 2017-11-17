package WebCrowler;

//This package implements a web crowler with breadth first search algorithm

public class App {

    public static void main (String[] args) {

        BFS bfs = new BFS();
        bfs.discoverWeb("http://www.bbc.com/");
    }
}
