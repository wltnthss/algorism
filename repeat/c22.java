package repeat;

import java.util.Scanner;

public class c22 {
    
    public static void main(String[] args) {
        
        // heLLo 입력시 대소문자 전환되어 출력  ex) HEllO
        Scanner sc = new Scanner(System.in);

        // 대문자일 때는 소문자로 전환 , 소문자일 때는 대문자로 전환
        String input = sc.next();
        char[] arr = input.toCharArray();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(('A' <= ch) && (ch <= 'Z')){
                arr[i] = (char)('a' + ch - 'A');
            }else{
                arr[i] = (char)('A' + ch - 'a');
            }
        }
        System.out.println(arr);
    }
}
