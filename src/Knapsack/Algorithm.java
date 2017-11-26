package Knapsack;

public class Algorithm {

    private int numOfItems;
    private int knapsackCapacity;
    private int[] weights;
    private int[] values;
    private int[][] finalTable;

    public Algorithm(int numOfItems, int knapsackCapacity, int[] weights, int[] values) {
        this.knapsackCapacity = knapsackCapacity;
        this.numOfItems = numOfItems;
        this.values = values;
        this.weights = weights;
    }

    public int knapsack() {

        int [][] table = new int[numOfItems][knapsackCapacity+1];

        for (int row=0; row<numOfItems; row++) {
            for (int column=0; column<knapsackCapacity+1; column++){

                if (column == 0) {
                    table[row][column] = 0;
                }

                if (column < weights[row]) {
                    if (row == 0) {
                        table[row][column] = 0;
                    }
                    else {
                        table[row][column] = table[row-1][column];
                    }
                }

                if (column >= weights[row]) {
                    if (row == 0) {
                        table[row][column] = values[row];
                    } else {

                        table[row][column] = Math.max(table[row - 1][column],
                                (values[row]+table[row-1][column-weights[row]]));
                    }
                }
                //System.out.println(row + "-" + column + "-" + table[row][column]);
            }
        }
        this.finalTable = table;
        return table[numOfItems-1][knapsackCapacity];
    }

    public void showWeights () {
        int row = numOfItems-1;
        int column = knapsackCapacity;
        for (;;) {
            if (finalTable[row][column] != finalTable[row-1][column]){
                System.out.println(weights[row] + "-" + values[row]);
                column = column-weights[row];
                row = row-1;
            } else {
                row = row-1;
            }
            if (finalTable[row][column] == 0){break;}
        }
    }
}
