/**
Accepted
48 / 48 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Jul 18, 2025 15:38

Editorial

Solution
Runtime
60
ms
Beats
82.63%
Analyze Complexity
Memory
55.81
MB
Beats
99.57%
*/

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> history = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];

            while (!history.empty() && temperature > history.peek()[1]) {
                int[] previous = history.pop();
                res[previous[0]] = i - previous[0];

            }
            res[i] = 0;
            history.push(new int[]{i, temperature});
        }

        return res;
        
    }
}
