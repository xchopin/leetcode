/**
Accepted
100 / 100 testcases passed
Xavier Chopin
Xavier Chopin
submitted at Jul 10, 2025 17:41

Editorial

Solution
Runtime
2
ms
Beats
96.77%
Analyze Complexity
Memory
41.60
MB
Beats
92.17%
*/

class ValideParentheses {
    public boolean isValid(String s) {
        Stack<Character> openedBrackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (closeBracketChar(current)) {
                if (openedBrackets.empty() || !matchBracket(openedBrackets.pop(), current)) {
                    return false;
                }
            } else {
                openedBrackets.push(current);
            }
        }

        return openedBrackets.empty();
        
    }

    public boolean closeBracketChar(char c) {
        return (c == ')' || c == '}' || c == ']');
    }


    public boolean matchBracket(char open, char close) {
        return open == '(' && close == ')' 
               || open == '{' && close == '}'
               || open == '[' && close == ']';
    }

}
