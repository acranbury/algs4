/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class Percolation {

    private int grid[][];
    private int size[][];

    private int root(int i) {
        while (i != grid[i]) i = grid[i];
        return i;
    }

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        grid = new int[n][n];
        size = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = i * n + j;
                size[i][j] = 1;
                StdOut.print(grid[i][j] + " ");
            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {

    }

    // returns the number of open sites
    // public int numberOfOpenSites() {
    //
    // }
    //
    // // does the system percolate?
    // public boolean percolates() {
    //
    // }

    // test client
    public static void main(String[] args) {
        Percolation p = new Percolation(5);
    }
}
