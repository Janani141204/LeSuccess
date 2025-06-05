{

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // push opening brackets
            } else {
                if (stack.isEmpty()) return false; // no matching opening bracket
                char top = stack.pop();
                if (!isMatching(top, ch)) return false;
            }
        }

        return stack.isEmpty(); // must be empty if all brackets matched
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String input1 = "((()))";
        String input2 = "(()";

        System.out.println(input1 + " → Output: " + (isBalanced(input1) ? "Balanced" : "Not Balanced"));
        System.out.println(input2 + " → Output: " + (isBalanced(input2) ? "Balanced" : "Not Balanced"));
    }
}