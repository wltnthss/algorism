package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 대소문자바꾸기v2 {
    
    public static void main(String[] args) {

        String result = "";

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        // for(int i=0; i<input.length(); i++){
        //     if('A' <= input.charAt(i) && input.charAt(i) <= 'Z'){
        //         System.out.println(i + " 대문자 ");
        //     }else{
        //         System.out.println(i + " 소문자 ");
        //     }
        // }

        char[] arr = input.toCharArray();

        for(int i=0; i<input.length(); i++){
            if('A' <= input.charAt(i) && input.charAt(i) <= 'Z'){
                System.out.println(arr[i]);
                result = result + Character.toLowerCase(arr[i]);
            }else{
                System.out.println(arr[i]);
                result = result + Character.toUpperCase(arr[i]);
            }
        }

        System.out.println(result);
    }
}
