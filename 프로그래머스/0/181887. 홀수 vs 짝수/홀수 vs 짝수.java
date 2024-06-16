class Solution {
    public int solution(int[] num_list) {
        int sumOdd = 0;
        int sumEven = 0;
        
        for(int i=0; i<num_list.length; i++){
            int idx = i+1;
            
            if(idx % 2 == 0){
                sumEven += num_list[i];
            }else{
                sumOdd += num_list[i];
            }
        }
        return sumEven > sumOdd ? sumEven : sumOdd;
    }
}