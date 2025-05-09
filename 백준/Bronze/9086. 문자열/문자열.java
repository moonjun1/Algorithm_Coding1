import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        String[] arr2 = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            arr2[i] ="" + arr[i].charAt(0) + arr[i].charAt(arr[i].length() - 1);
        }

        for (String s : arr2) {
            System.out.println(s);
        }
    }
}