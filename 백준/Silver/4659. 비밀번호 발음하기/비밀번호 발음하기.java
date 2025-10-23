import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String password = sc.nextLine();

            if (password.equals("end")) {
                break;
            }

            if (isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }

        sc.close();
    }

    static boolean isAcceptable(String password) {
        if (!hasVowel(password)) {
            return false;
        }

        if (hasThreeConsecutive(password)) {
            return false;
        }

        if (hasSameConsecutive(password)) {
            return false;
        }

        return true;
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    static boolean hasVowel(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (isVowel(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    static boolean hasThreeConsecutive(String password) {
        if (password.length() < 3) {
            return false;
        }

        for (int i = 0; i < password.length() - 2; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            char c3 = password.charAt(i + 2);

            if (isVowel(c1) && isVowel(c2) && isVowel(c3)) {
                return true;
            }

            if (!isVowel(c1) && !isVowel(c2) && !isVowel(c3)) {
                return true;
            }
        }

        return false;
    }

    static boolean hasSameConsecutive(String password) {
        if (password.length() < 2) {
            return false;
        }

        for (int i = 0; i < password.length() - 1; i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);

            if (c1 == c2) {
                if (c1 != 'e' && c1 != 'o') {
                    return true;
                }
            }
        }

        return false;
    }
}
