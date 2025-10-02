import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 단어공부
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Keep the input as is (case-sensitive)

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : arr) {
            input = input.replace(s, "X"); // Replace Croatian alphabets with "X"
        }

        System.out.println(input.length()); // Output the length of the modified string
    }
}