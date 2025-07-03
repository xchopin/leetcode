/**
Accepted
987 / 987 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Jul 03, 2025 13:51

Editorial

Solution
Runtime
6
ms
Beats
72.09%
Analyze Complexity
Memory
44.64
MB
Beats
68.95%

*/
class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int leftCursor = 0;
        int rightCursor = 0;
        int res = 1;
        Set<Character> set = new HashSet<>();

        while (leftCursor <= rightCursor && rightCursor < s.length()) {
            if (set.contains(s.charAt(rightCursor))){
                set.remove(s.charAt(leftCursor));
                leftCursor++;
            } else {
                set.add(s.charAt(rightCursor));
                rightCursor++;
                res = Math.max(res, set.size());
            }

        }

        return res;
    }
}
