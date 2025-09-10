import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 리버스
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String reverse = new StringBuilder(text).reverse().toString(); // 문자열 뒤집기

        if (text.equals(reverse)) {
            System.out.println("1"); // 팰린드롬일 경우
        } else {
            System.out.println("0"); // 팰린드롬이 아닐 경우
        }
    }
}