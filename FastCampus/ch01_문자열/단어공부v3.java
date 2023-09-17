package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 단어공부v3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String doc = sc.next();
        String word = sc.next();

        String result = doc.replace(word, "");
        int length = doc.length() - result.length();
        int cnt = length / word.length();
        System.out.println(cnt); 
    }
}
