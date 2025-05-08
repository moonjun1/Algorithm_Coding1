import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cost, count;
        int total = sc.nextInt();
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            cost = sc.nextInt();
            count = sc.nextInt();

            total -= cost * count;
        }

        if(total == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}