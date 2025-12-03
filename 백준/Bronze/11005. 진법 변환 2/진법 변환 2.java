import java.util.*;

// 백준 코테
/*

진법 변환
1. 입력 받기
2. 글자를 숫자로 변환  아스키 코드 사용


 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int r = n % b;
            //1 . 나머지가 10보다 작으면
            if (r < 10) {
                sb.append((char)(r + '0'));
            }
            //2 . 나머지가 10 이상이면
            else {
                sb.append((char)(r - 10 + 'A'));
            }
            n /= b;
        }
        System.out.println(sb.reverse());

 

    }
}
