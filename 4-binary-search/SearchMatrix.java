/** Accepted
133 / 133 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 04, 2025 10:36

Editorial

Solution
Runtime 0 ms
Beats 100.00%
Analyze Complexity
Memory
42.00MB
Beats 91.81%
**/

class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int rowToSearch = -1;


        // O(m)
        for (int r = 0; r < rows; r++) {
            int valueFirst = matrix[r][0];
            int valueLast = matrix[r][columns - 1];

            if (target >= valueFirst && target <= valueLast) {
                rowToSearch = r;
                break;
            }
        }

        if (rowToSearch == -1) {
            return false;
        }


    int low = 0;
    int high = columns - 1;

    // O(log n)
    while (low <= high) {
        int pivot = low + (high - low) / 2;
        int pivotVal = matrix[rowToSearch][pivot];

        if (pivotVal == target) {
            return true;
        } else if (pivotVal < target) {
            low = pivot + 1;
        } else {
            high = pivot - 1;
        }
    }

    return false;
    }
}
