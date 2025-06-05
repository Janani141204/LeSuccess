import java.util.Stack;

public class Main {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(ch);
            }
        }

        // Build result from stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";
        System.out.println("Output: " + removeDuplicates(input)); // Output: "ca"
    }
}
