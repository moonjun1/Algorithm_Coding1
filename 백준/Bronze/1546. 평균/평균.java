import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int socre : arr){
            if (socre > max){
                max = socre;
            }
        }

        double result = 0;
        for (int i = 0; i < n; i++) {
            result += (double) arr[i] / max * 100;
        }

        System.out.println(result / n);
    }
}