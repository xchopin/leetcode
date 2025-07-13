/**
Runtime 0ms Beats 100.00%

Memory 45.02MB Beats 93.58%

Solution explained
https://leetcode.com/problems/missing-number/solutions/6955102/on-o1-with-simple-math-beats-100-and-by-16jtc/
*/

class MissingNumber {
    public int missingNumber(int[] nums) {
        int maxNumber = nums.length;
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int expected = maxNumber * (maxNumber + 1) / 2;

        return expected - sum ;
    }
}
