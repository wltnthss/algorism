class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = my_string.length()-1; i >= 0; i--) {
            char ch = my_string.charAt(i);

            sb.append(ch);
        }
        
        return sb.toString();
    }
}