import java.util.*;

// 백준 코테
/*

중앙이동 알고리즘



 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int side = 2;

        for (int i = 0; i < n; i++) {
            side = side + (side -1);
        }

        System.out.println(side * side);


    }
}
