import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(" is  Palindrome: TRUE");
        } else {
            System.out.println("is  Palindrome: FALSE");
        }

        scanner.close();
    }


}
