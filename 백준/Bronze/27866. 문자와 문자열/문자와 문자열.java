import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(input.charAt(n - 1));

    }
}