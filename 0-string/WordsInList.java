public class WordInList {
  public int countCharacters(String[] words, String chars) {
        int res = 0;
        Map<Character, Integer> letters = new HashMap<>();

        // count the letters available
        for (int i = 0; i < chars.length(); i++) {
            letters.compute(chars.charAt(i), (k, v) -> {
                if (v == null) {
                   return 1;
                }
                return v + 1;
            });
        }

        for (String w : words) {
            if (w == null) {
                break;
            }

            Map<Character, Integer> tempLetters = new HashMap<>(letters);

            for (int i = 0; i < w.length(); i++) {
                int amountLetter = tempLetters.getOrDefault(w.charAt(i), 0);
                if (amountLetter == 0) {
                    break;
                }
              
                tempLetters.put(w.charAt(i), amountLetter - 1);

                if (i == w.length() - 1) {
                    res += w.length();
                }
            }
        }

        return res;
    }
}
