import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a,b, temp;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}