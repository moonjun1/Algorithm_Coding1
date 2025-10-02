import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //단어공부
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] freq = new int[26];

        // 알파벳 빈도 계산
        for (char c : input.toCharArray()) {
            freq[c - 'A']++;
        }

        //최대 빈도와 해당 알파뱃 찾기
        int maxFreq = 0;
        char result = '?';
        for(int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char) (i + 'A');
            } else if (freq[i]  == maxFreq){
                result = '?';
            }
        }

        System.out.println(result);


    }
}

