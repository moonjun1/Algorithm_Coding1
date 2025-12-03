import java.util.*;

// 백준 최대 값
/*

격자판 81개의 자연수 또는 0이 주어질떄 최대 닶을 찾고 그 최대값이 몇행 몋열에 우ㅏ차한수인지 알아야함

1. 2차원 배열로 입력 받기
2. for 문으로 돌아가면서 최대값 찾기
3. 최대 값 저장한 것을 출력
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = -1;
        int row = 0;
        int col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }


        System.out.println(max);
        System.out.println(row + " " + col);

    }
}
