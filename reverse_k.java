import java.util.*;

public class Main {

    // Function to reverse first k elements of a queue
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k < 0) {
            System.out.println("Invalid input");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push first k elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Enqueue elements from the stack back to the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Step 3: Move the remaining elements to the back
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.offer(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        int k = 3;

        System.out.println("Original Queue: " + queue);
        reverseFirstK(queue, k);
        System.out.println("After reversing first " + k + " elements: " + queue);
    }
}
