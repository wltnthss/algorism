package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 대소문자바꾸기v2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] arr = input.toCharArray();

        for(int i=0; i<input.length(); i++){
            if('A' <= input.charAt(i) && input.charAt(i) <= 'Z'){
                arr[i] = ((char)('a' + input.charAt(i) - 'A'));
            }else{
                arr[i] = ((char)('A' + input.charAt(i) - 'a'));
            }
        }
        System.out.println(arr);
    }
}
