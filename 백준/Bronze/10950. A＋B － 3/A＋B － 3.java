import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int arr[] =  new int[count];

        for(int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i] = a + b;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}