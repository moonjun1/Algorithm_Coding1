import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,x;
        int index = 0;
        n = sc.nextInt();
        x = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (x > arr[i]) {
                arr2[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(arr2[i] +" ");
        }



    }
}