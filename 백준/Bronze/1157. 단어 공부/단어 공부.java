import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        /*
         * 입력
         * 대소문자로 된 단어 제시, 이 단어에서 가장 많이 사용된 알파벳은 무엇인지? (대소문자 구분 X)
         * 출력
         * 대문자 출력, 동일한 사용횟수면 ? 출력
         */

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int[] result = getAlphabet(input);

        int maxCnt = -1;
        char maxAlphabet = '?';

        for(int i = 0; i < 26; i++){
            if( result[i] > maxCnt){
                maxCnt = result[i];
                maxAlphabet = (char)('A' + i);
            }
            else if(result[i] == maxCnt){
                maxAlphabet = '?';
            }
        }

        // 각 알파벳의 개수를 구하고, 그 중 최댓값을 구해야함.

        System.out.println(maxAlphabet);
        
    }

    private static int[] getAlphabet(String input) {
        
        int[] result = new int[26];

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if((ch >= 'A') && (ch <= 'Z')){
                result[ch - 'A']++;
            }else{
                result[ch - 'a']++;
            }
        }
        return result;
    }
}
