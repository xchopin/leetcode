class Solution {

    // Divide and Conquer solution
    public int search(int[] nums, int target) {
        if (nums.length > 0) {
            int start = 0;
            int end  = nums.length;

            if (nums.length > 2) {
                boolean upperSide = target >= nums[nums.length / 2];

                start = upperSide ? (nums.length / 2) : 0;
                end = upperSide ? nums.length : (nums.length / 2);
            }


            for (int i = start; i < end; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}
