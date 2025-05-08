import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int count;
        if (first == second && second == third) {
            count = 10000 + first * 1000;
        } else if (first == second || first == third) {
             count = 1000 + first * 100;
        } else if (second == third) {
            count = 1000 + second * 100;
        }

        else {
           count = Math.max(first, Math.max(second, third)) * 100;
        }

        System.out.println(count);

    }
}