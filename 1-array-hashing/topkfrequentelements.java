// Runtime 9 ms Beats 97.15% Complexity Memory 49.07 MB Beats 25.29%
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberCounter = new HashMap<>();
        Map<Integer, List<Integer>> buckets = new HashMap<>();
        int[] res = new int[k];
        int nthResult = 0;

        // count occurrences
        for (int num : nums) {
            numberCounter.merge(num, 1, Integer::sum);
        }

        // create buckets of numbers based on their occurrence
        for (var entry : numberCounter.entrySet()) {
            int num = entry.getKey();
            int occurence = entry.getValue();

            buckets.computeIfAbsent(occurence, _ -> new ArrayList<>()).add(num);
        }

        // pick the k elements 
        for (int i = nums.length; i > 0 && nthResult < k; i--) {
            if (buckets.containsKey(i)) {
                for (int num : buckets.get(i)) {
                    if (nthResult < k) {
                        res[nthResult++] = num;
                    }
                }
            }
        }

        return res;
    }
}
