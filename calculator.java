import java.util.Scanner;

class Calculator {
    int result;                          // Instance variable
    static int operationCount = 0;      // Static variable

    void add(int a, int b) {            // Instance method
        result = a + b;
        operationCount++;
        System.out.println("Result: " + result);
    }

    static void displayOperationCount() {  // Static method
        System.out.println("Total operations performed: " + operationCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        System.out.print("Enter two numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c1.add(a, b);

        System.out.print("Enter two more numbers to add: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        c2.add(x, y);

        Calculator.displayOperationCount();
    }
}