
// Runtime 7 ms Beats 29.00% O(N) - Memory 44.35 MB Beats 95.64%
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> buffer = new Stack<>();
        for (String token : tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                // time for calculation baby!
                int a = buffer.pop();
                int b = buffer.pop();

                int res = switch (token) {
                    case "+" -> a + b;
                    case "-" -> b - a;
                    case "*" -> a * b;
                    case "/" -> b / a ;
                    default -> throw new IllegalStateException("Unexpected value: " + token);
                };

                buffer.add(res);
            } else {
                int value = Integer.parseInt(token);
                buffer.add(value);
            }
        }

        return buffer.peek();
    }
}
