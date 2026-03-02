import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to Palindrome Checker Management System \nVersion:1.0 \nSystem initialised successfully");
        System.out.println("Input text: ");
        String str = sc.next() ;
        String cpr="";
        int l = str.length();
        for(int i=l-1; i>=0; i--) {
            cpr = cpr + str.charAt(i);
        }
            if (str.equalsIgnoreCase(cpr)){
                System.out.println("Is a palindrone: True");
            }
            else{
                System.out.println("Is a palindrone: False");
            }

    }


}
