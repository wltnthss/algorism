package repeat;

import java.util.Scanner;

public class c23 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = sc.nextLine();

        /*
         * aaaaaaaa -> input
         * aaa -> output
         * result -> 2
         * 8개의 input 동일한 ouput 제거하고 남은 result 2를 출력해야함.
         */

        String result = input.replace(output, "");
        int isLengthed = input.length() - result.length();
        int cnt = isLengthed / output.length();
        System.out.println(cnt);

        

    }
}
