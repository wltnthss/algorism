class Solution {
    public String solution(int age) {
        
        String[] sArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - '0';

            sb.append(sArr[val]);
        }
        
        return sb.toString();
    }
}