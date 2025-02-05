// Runtime 2 ms Beats 88.38% Memory 56.30 MB Beats 16.16%
class ProductOfArrayExcepSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] leftToRight = new int[nums.length];
        int[] rightToLeft = new int[nums.length];
        int[] res = new int[nums.length];
        int lastIndex = nums.length - 1;

        rightToLeft[0] = 1;
        leftToRight[lastIndex] = 1;

        for (int i = 1; i < nums.length; i++) {
            rightToLeft[i] = rightToLeft[i - 1] * nums[i - 1];
        }

        for (int i = lastIndex - 1; i >= 0; i--) {
            leftToRight[i] = leftToRight[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = rightToLeft[i] * leftToRight[i];
        }

        return res;
    }
}
