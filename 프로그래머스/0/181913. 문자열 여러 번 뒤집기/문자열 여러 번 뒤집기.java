class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for (int[] query: queries) {
            int a = query[0];
            int b = query[1];

            while(a < b){
                char tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;

                a++;
                b--;
            }
        }
        
        return new String(arr);
    }
}