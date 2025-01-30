
/**
 * 19ms Beats 14.82% O(N)
 * 
 * 44.56MB Beats 52.23%
 */

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
         Map<Character, Integer> charS = new HashMap<>();
         Map<Character, Integer> charT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            charS.merge(s.charAt(i), 1, Integer::sum);
            charT.merge(t.charAt(i), 1, Integer::sum);
        }

        return charS.equals(charT);
    }
}
