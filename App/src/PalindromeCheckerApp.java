import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean twoPointerPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 2: Stack-based approach
    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Measure Two-pointer algorithm
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Measure Stack algorithm
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1);
        System.out.println("Execution Time: " + time1 + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Execution Time: " + time2 + " ns");

        scanner.close();
    }
}