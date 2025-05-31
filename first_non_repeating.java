import java.util.*;

public class FirstNonRepeatingChar {
    public static int firstUniqueChar(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int result = firstUniqueChar(input);
        System.out.println("Output: " + result);
    }
}