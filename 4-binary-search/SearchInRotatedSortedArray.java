public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int pivot = (l + r) / 2;

            if (nums[pivot] == target) {
                return pivot;
            }

            if (nums[l] <= nums[pivot]) {
                if (nums[l] <= target && target < nums[pivot]) {
                    r = pivot - 1;
                } else {
                    l = pivot + 1;
                }
            } else {
                if (nums[r] >= target && nums[pivot] < target) {
                    l = pivot + 1;
                } else {
                    r = pivot - 1;
                }
            }
        }

        return -1;
    }
}
