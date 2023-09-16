package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 문서검색v1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        
        //indexOf 사용
        int cnt = 0;
        int stIndex = 0;
        while(true){
            int findIndex = doc.indexOf(word, stIndex);
            if(findIndex < 0){
                break;
            }
            cnt++;
            stIndex = findIndex + word.length();
        }
        System.out.println(cnt);
    }
}
