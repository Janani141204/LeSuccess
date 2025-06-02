import java.util.Scanner;

public class Main {
    static int repeat(String s, long n) {
       int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        int full = n / s.length();
        int total = full * count;
        int rem = n % s.length();
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a') {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println(repeat(s, n));
        scanner.close();
    }
}
