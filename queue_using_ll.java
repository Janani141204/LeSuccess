class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    Queue() {
        front = rear = null;
    }

    // Enqueue operation
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue operation
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return value;
    }

    // Display the queue
    void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();

        queue.enqueue(40);
        queue.display();
    }
}
