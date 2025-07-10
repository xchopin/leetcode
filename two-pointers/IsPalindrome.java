/** 
Accepted
486 / 486 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Jul 10, 2025 16:02

Editorial

Solution
Runtime
2
ms
Beats
98.47%
Analyze Complexity
Memory
43.14
MB
Beats
69.90%

*/
class IsPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            while (left < right && isSpecialChar(s.charAt(right))) {
                right--;
            }

            while (left < right && isSpecialChar(s.charAt(left))) {
                left++;
            }

            if ((s.charAt(left) != s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isSpecialChar(char c) {
        return !((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}
