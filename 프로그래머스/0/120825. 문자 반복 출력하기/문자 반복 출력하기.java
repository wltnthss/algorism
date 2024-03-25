class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        for (Character c: ch) {
            sb.append(c.toString().repeat(n));
        }
        return sb.toString();
    }
}