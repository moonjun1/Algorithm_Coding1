class Solution {
    public int[] solution(int[] array) {
        // 1. 초기값 설정: 배열의 첫 번째 원소를 초기 최댓값과 인덱스로 설정
        int max = array[0]; 
        int maxIndex = 0; 

        // 2. 배열을 순회하며 최댓값과 인덱스 찾기
        for (int i = 0; i < array.length; i++) {
            // 현재 원소 array[i]가 현재까지의 최댓값(max)보다 크다면
            if (array[i] > max) {
                // 최댓값 갱신
                max = array[i]; 
                // 인덱스 갱신
                maxIndex = i;   
            }
        }
        
        // 3. 결과 배열 [가장 큰 수, 인덱스] 형태로 반환
        int[] answer = {max, maxIndex};
        return answer;
    }
}