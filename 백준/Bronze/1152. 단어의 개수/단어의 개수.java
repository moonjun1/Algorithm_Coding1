import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        if (input.charAt(0) == ' ') {
            count--;
        }

        if (input.length() > 0 && input.charAt(input.length() - 1) == ' ') {
            count--;
        }
        System.out.println(count + 1);
    }

}