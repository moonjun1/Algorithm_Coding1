import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a,b,c;
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;
            c = sc.nextInt();
            for (int j = a; j <= b; j++) {
                arr[j] = c;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}