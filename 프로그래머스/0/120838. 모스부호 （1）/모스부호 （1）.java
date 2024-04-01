import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseArr;
        StringBuilder sb = new StringBuilder();
        morseArr = letter.split(" ");
        
        for(String s : morseArr){
            for(int i=0; i<morse.length; i++){
                if(s.equals(morse[i])){
                    sb.append(Character.toString(i + 'a'));
                }
            } 
        }
        
        return sb.toString();
    }
}