import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 그룹 단어 체커
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); 
        int groupWordCount = 0; 

        for (int i = 0; i < count; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;

            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if (j > 0 && currentChar != word.charAt(j - 1)) {
                    if (visited[currentChar - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                }
                visited[currentChar - 'a'] = true;
            }

            if (isGroupWord) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount); // Output the number of group words
    }
}