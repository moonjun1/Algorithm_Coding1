import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 행렬 덧셈
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // 행렬 A 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // 행렬 B 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // 행렬 A와 B의 합 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((a[i][j] + b[i][j]) + " "); // 같은 행의 원소를 한 줄에 출력
            }
            System.out.println(); // 행이 끝나면 줄바꿈
        }

        sc.close();
    }
}