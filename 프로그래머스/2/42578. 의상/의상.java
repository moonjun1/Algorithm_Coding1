import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        // 1. 의상 종류별로 개수를 저장할 해시맵 생성
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String type = cloth[1];
            // 해당 종류가 이미 있다면 +1, 없으면 0에서 +1
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        // 2. 경우의 수 계산
        int answer = 1; // 곱셈을 위해 1로 시작
        
        for (int count : map.values()) {
            // (해당 종류의 의상 수 + 입지 않는 경우 1)을 곱함
            answer *= (count + 1);
        }
        
        // 3. 아무것도 입지 않는 경우 1을 빼고 반환
        return answer - 1;
    }
}