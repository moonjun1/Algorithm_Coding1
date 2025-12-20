import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;

        // 1. 조건에 맞는 원소가 몇 개인지 먼저 확인 (향상된 for문)
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        // 2. 나누어 떨어지는 게 하나도 없다면 바로 [-1] 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 3. 개수만큼 딱 맞는 크기의 배열 생성
        int[] answer = new int[count];
        int index = 0;

        // 4. 다시 순회하며 배열에 값 채우기 (향상된 for문)
        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index++] = num;
            }
        }

        // 5. 오름차순 정렬
        Arrays.sort(answer);

        return answer;
    }
}