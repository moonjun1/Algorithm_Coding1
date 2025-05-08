import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        year  = year - 544 + 1;
        System.out.println(year);
    }
}