import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = num1; i <= num2; i++) {
            list.add(numbers[i]);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}