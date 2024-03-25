import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }
        Collections.reverse(list);
        
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}