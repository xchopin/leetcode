// Could be more efficient without using a replaceAll and using a utility method to check if a char is alphanum but honestly it's more maintenable this way

class IsPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
