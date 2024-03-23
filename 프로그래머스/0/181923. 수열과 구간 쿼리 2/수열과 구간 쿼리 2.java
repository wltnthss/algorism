import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];

        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];

            int min = Integer.MAX_VALUE;

            for(int z=a; z<=b; z++){
                if(arr[z] > c && arr[z] < min){
                    min = arr[z];
                }
            }
            result[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return result;
    }
}