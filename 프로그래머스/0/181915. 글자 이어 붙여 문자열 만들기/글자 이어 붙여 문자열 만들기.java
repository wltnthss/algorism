class Solution {
    public String solution(String my_string, int[] index_list) {
        
        String rslt = "";
        StringBuilder sb = new StringBuilder();
        String[] str = new String[my_string.length()];

        for (int i = 0; i < str.length; i++) {
            String s = String.valueOf(my_string.charAt(i));
            str[i] = s;
        }
        
        for (int i = 0; i < index_list.length; i++) {
            sb.append(str[index_list[i]]);
        }

        return sb.toString();
    }
}