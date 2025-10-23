import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();  // 버퍼 비우기

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();

            // 1. 알파벳 빈도수 세기
            int[] count = new int[26];
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c != ' ') {  // 공백 제외
                    count[c - 'a']++;
                }
            }

            // 2. 최대 빈도수 찾기
            int max = 0;
            for (int j = 0; j < 26; j++) {
                if (count[j] > max) {
                    max = count[j];
                }
            }

            // 3. 최대 빈도수를 가진 알파벳 개수 세기
            int maxCount = 0;
            char result = '?';
            for (int j = 0; j < 26; j++) {
                if (count[j] == max) {
                    maxCount++;
                    result = (char) (j + 'a');  // 인덱스를 알파벳으로 변환
                }
            }

            // 4. 결과 출력
            if (maxCount > 1) {
                System.out.println('?');
            } else {
                System.out.println(result);
            }
        }

        sc.close();
    }
}
