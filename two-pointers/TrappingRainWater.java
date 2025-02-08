// Runtime 0 ms Beats 100.00%  Memory 46.70 MB Beats 19.33%

class TrappingRainWater {
    public int trap(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;

        // Skip flat borders
        while (left < right && height[left] == 0) {
            left++;
        }

        while (left < right && height[right] == 0) {
            right--;
        }

        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];

            // if the left pointer has a lower height than pointer right, then we should consider moving right
            if (leftHeight < rightHeight) {
                int leftExplorer = left + 1;
                while (leftExplorer < right && height[leftExplorer] <= leftHeight) {
                    water += leftHeight - height[leftExplorer];
                    leftExplorer++;
                }

                left = leftExplorer;
            } else {
                int rightExplorer = right - 1;
                while (rightExplorer > left && height[rightExplorer] <= rightHeight) {
                    water += rightHeight - height[rightExplorer];
                    rightExplorer--;
                }

                right = rightExplorer;
            }
        }

        return water;
    }
}
