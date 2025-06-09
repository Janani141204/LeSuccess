import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class LeafNodeCounter {

    public static Node buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            if (i < arr.length && arr[i] != -1) {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != -1) {
                current.right = new Node(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static int countLeafNodes(Node root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null)
            return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in level-order (-1 for null):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = buildTree(arr);
        int leafCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes: " + leafCount);
    }
}
