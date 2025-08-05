/**
Accepted
69 / 69 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Aug 05, 2025 15:55

Solution
Runtime
3ms Beats 86.97%
Analyze Complexity
Memory 60.60MB Beats 94.14%
*/

class NumOfSubarrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int compute = 0;
        double avg = 0;

        int left = 0;
        int right = k;


        // Create first window
        for (int i = left ; i < k; i++) {
            compute += arr[i];
        }

        avg = compute / k;

        if ((avg - threshold) >= 0) {
            res++;
        }

        while (right < arr.length) {
            compute = (compute - arr[left]) + arr[right];
            avg = compute / k;

            if ((avg - threshold) >= 0) {
                res++;
            }

            left++;
            right++;

        }

        return res;
        
    }
}
