class Solution {
    public int[] solution(long n) {
        // 1. 자릿수를 구하기 위해 문자열로 변환
        String str = String.valueOf(n);
        
        // 2. 구한 자릿수(길이)만큼 배열 공간 만들기 (중요!)
        // 기존의 {} 대신 new int[...]를 써야 합니다.
        int[] answer = new int[str.length()];
        
        int index = 0;
        while (n > 0) {
            // 3. 형변환 문법 수정: (int)(...)
            answer[index] = (int)(n % 10);
            
            n /= 10;
            
            // 4. 세미콜론(;) 추가
            index++;
        }
        
        return answer;
    }
}