package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 애너그램v1 {
    
    // 두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때, 애너그램 관계라고함.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();

        // n1과 n2의 알파벳 구성을 먼저 구해야함.
        int[] cntA = new int[26];
        int[] cntB = new int[26];

        int result = 0;

        for(int i = 0; i<n1.length(); i++){
            cntA[n1.charAt(i) - 'a']++;
        }
        for(int i = 0; i<n2.length(); i++){
            cntB[n2.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(cntA[i] > cntB[i]){
                result += cntA[i] - cntB[i];
            }else if(cntB[i] > cntA[i]){
                result += cntB[i] - cntA[i];
            }
        }
        System.out.println(result);
    }
}
