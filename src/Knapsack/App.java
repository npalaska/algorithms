package Knapsack;

public class App {

    public static void main (String[] args) {

        int[] weights = new int[4];
        int[] values = new int[4];

        weights[0] = 1;
        weights[1] = 3;
        weights[2] = 4;
        weights[3] = 5;

        values[0] = 1;
        values[1] = 4;
        values[2] = 5;
        values[3] = 7;

        Algorithm al = new Algorithm(4, 7, weights, values);
        System.out.println(al.knapsack());
        al.showWeights();
    }
}
