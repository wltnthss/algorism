import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        var list = new ArrayList<Integer>();
        list.add(n);

        while(true){

            if(n % 2 == 0){
                n /= 2;
            }else{
                n = 3 * n + 1;
            }

            list.add(n);

            if(n == 1){
                break;
            }
        }
        return list.stream().mapToInt(k -> k).toArray();
    }
}