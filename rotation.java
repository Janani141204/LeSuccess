import java.util.*;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String combined = s1 + s1;
        return combined.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter string s2: ");
        String s2 = sc.nextLine();

        boolean result = isRotation(s1, s2);
        System.out.println("Output: " + result);
    }
}