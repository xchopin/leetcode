/**

Accepted
10 / 10 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 07, 2025 17:43

Editorial

Solution
Runtime
0
ms
Beats
100.00%
Analyze Complexity
Memory
42.70
MB
Beats
82.65%


*/

// Backtracking solution
class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        dfs(0, nums.length, new ArrayList<>(), subsets, nums);
        return subsets;
    }

    public void dfs(int index, int n, List<Integer> subset, List<List<Integer>> subsets, int[] nums) {
        if (index >= n) {
            subsets.add(subset);
            return;
        }

       int value = nums[index];

        // don't add
        dfs(index + 1, n, new ArrayList<>(subset), subsets, nums);

        // add
        subset.add(value);
        dfs(index + 1, n, new ArrayList<>(subset), subsets, nums);
    }
}
