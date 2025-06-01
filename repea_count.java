import java.util.Scanner;

public class Main {
    static long repeat(String s, long n) {
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }
        long full = n / s.length();
        long total = full * count;
        long rem = n % s.length();
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
        long n = scanner.nextLong();
        System.out.println(repeat(s, n));
        scanner.close();
    }
}
