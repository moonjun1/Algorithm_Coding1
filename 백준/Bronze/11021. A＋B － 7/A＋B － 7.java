import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count=0,count2 = 0;
        int[] arr = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            count = sc.nextInt();
            count2 = sc.nextInt();
            arr[i] = count + count2;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Case #"+ i + ": " + arr[i]);

        }


    }
}