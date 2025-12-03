import java.util.*;

// 백준 코테
/*

달러 계산기


 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] dollar = new int[count];

        for (int i = 0; i < count; i++) {
            dollar[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int money  = dollar[i];
            int q = money / 25;
            money = money % 25;
            
            int d = money / 10;
            money = money % 10;
            
            int n = money / 5;
            money = money % 5;
            
            int p = money;
            System.out.println(q + " " + d + " " + n + " " + p);
        }


    }
}
