import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;

        for(int i=0; i<included.length; i++){

            if(included[i]){
                answer += (a + d*i);
            }
        }

        return answer;
        
        // return IntStream.range(0, included.length).map(i -> included[i] ? a + (i*d) : 0).sum();
    }
}