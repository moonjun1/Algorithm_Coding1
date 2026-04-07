import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // 1. 숫자만 추출
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
                list.add(my_string.charAt(i) - '0');
            }
        }
        
        // 2. 정렬
        Collections.sort(list);
        
        // 3. 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}