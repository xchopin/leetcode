/**
Accepted
909 / 909 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 09, 2025 15:33

Solution
Runtime
2
ms
Beats
91.17%
Analyze Complexity
Memory
45.07
MB
Beats
76.37%

*/

class MinimumOperationsToWriteY {
    public int minimumOperationsToWriteY(int[][] grid) {
        int[] cellsOnY = new int[3];
        int[] cellsNotOnY = new int[3];
        int res = Integer.MAX_VALUE;
        int amountCellsY = 0;
        int amountCellsOutY = 0;
        int mid = grid.length / 2;

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                int value = grid[row][column];
                if (isCellOnY(row, column, grid, mid)) {
                    cellsOnY[value]++; 
                    amountCellsY++;
                } else {
                    cellsNotOnY[value]++; 
                    amountCellsOutY++;
                }
            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }

            int operations = (amountCellsY - cellsOnY[i]) + (amountCellsOutY - cellsNotOnY[j]);
        
            res = Math.min(res, operations);

            }
        }

        return res;

    }

    private boolean isCellOnY(int row, int column, int[][] grid, int half) {

        if (row < half) {
            if (column == row || (grid.length - 1 - column == row)) {
                return true;
            }
        } else {
            if (column == half) {
                return true;
            }
        }

        return false;
    }
}
