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

        String n = sc.next();
        int b = sc.nextInt();

        System.out.println(Integer.parseInt(n,b));


    }
}
