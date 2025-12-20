class Solution {
    boolean solution(String s) {
        // 1. 모든 문자를 소문자로 변환
        s = s.toLowerCase();
        
        int pCount = 0;
        int yCount = 0;

        // 2. 문자열을 순회하며 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') {
                pCount++;
            } else if (c == 'y') {
                yCount++;
            }
        }

        // 3. 개수 비교 (같으면 true, 다르면 false)
        return pCount == yCount;
    }
}