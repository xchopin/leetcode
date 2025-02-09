class ValideParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> closingBrackets = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        Stack<Character> unclosed = new Stack<>();

        for (int i = 0 ; i < s.length(); i++) {
            if (isCharBracket(s.charAt(i))) {
                // if it's a closing bracket it should be the first element of the unclosed
                if (closingBrackets.containsKey(s.charAt(i))) {
                    // if the top element of the unclosed bracket is the right one, the brackets are closed we can remove it
                    if (!unclosed.isEmpty() && unclosed.peek() == closingBrackets.get(s.charAt(i))) {
                        unclosed.pop();
                    } else {
                        return false;
                    }
                } else {
                    unclosed.add(s.charAt(i));
                }

            }
        }

        return unclosed.isEmpty();
    }

    private boolean isCharBracket(Character c) {
        Set<Character> chars = new HashSet<>();
        chars.add('(');
        chars.add('{');
        chars.add('[');
        chars.add(')');
        chars.add('}');
        chars.add(']');

        return chars.contains(c);
    }
}
