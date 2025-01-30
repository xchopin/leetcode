/**
 * Runtime 2 ms Beats 98.90% - Complexity Memory 44.94 MB Beats 61.63%
 */
class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();
        values.put(nums[0], 0);
        
        for (int i = 1; i < nums.length; i++) {
            int currentValue = nums[i];
            int difference = target - currentValue;
            
            if (values.containsKey(difference)) {
                return new int[]{values.get(difference), i};
            }
            
            values.put(nums[i], i);
        }
        
        return new int[]{};  
    }
}