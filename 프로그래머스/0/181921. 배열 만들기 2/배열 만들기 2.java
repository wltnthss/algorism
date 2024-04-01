import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for(int i=l; i<=r; i++){
            String str = i + "";
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == 48 || ch == 53){
                    count++;
                }
                if(str.length() == count){
                    list.add(i);
                }
            }
        }
        int[] answer = list.stream().mapToInt(k -> k).toArray();
        
        if(answer.length == 0){
            return new int[]{-1};
        }
        return answer;
    }
}