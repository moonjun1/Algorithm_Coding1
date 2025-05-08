import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count=0,count2 = 0;
        int[] arr = new int[num + 1];
        int[] arr2 = new int[num + 1];
        int[] arr3 = new int[num + 1];


        for (int i = 1; i <= num; i++) {
            arr2[i] = sc.nextInt();
            arr3[i] = sc.nextInt();
            arr[i] = arr2[i] + arr3[i];
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.println("Case #"+ i + ": "+ arr2[i]+ " + " + arr3[i]
                       + " = " + arr[i]);

        }


    }
}