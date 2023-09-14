package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 애너그램v2 {
    
    public static int[] alphaPosition(String str){

        int[] result = new int[26];

        for(int i=0; i<str.length(); i++){
            result[str.charAt(i) - 'a']++;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();

        int[] A = alphaPosition(n1);      // 알파뱃들의 갯수를 지정하는 배열
        int[] B = alphaPosition(n2);

        int result = 0;

        for(int i = 0; i < 26; i++){
            result += Math.abs(A[i] - B[i]);
        }
        System.out.println(result);
    }
}
