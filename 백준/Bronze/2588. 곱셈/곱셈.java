import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        int first, second, third;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        first = b % 10 ;
        second = (b / 10) % 10;
        third = b / 100;
        
        System.out.println(first * a);
        System.out.println(second * a);
        System.out.println(third * a);
        System.out.println(a * b);
        }
}