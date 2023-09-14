package FastCampus.ch01_문자열;

import java.util.Scanner;

public class 대소문자바꾸기v1 {
    
    public static void main(String[] args) {

        String result = "";

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        for(char c: input.toCharArray()){
            
            if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            }else{
                result += Character.toLowerCase(c);
            }
        }
        sc.close();
        System.out.println(result);
        
    }
}
