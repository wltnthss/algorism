package for_pratice;

import java.util.Scanner;

public class GausePlus {
    
    // 1부터 10까지의 합은 (1+10) * 5 로 구할 수 있음.
    // 1부터 n까지의 정수 합을 가우스의 덧셈 활용

    public static void main(String[] args){

        System.out.println("n의 값은???");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("1부터 n까지의 정수 합은 " + gauss(n) + " 입니다.");

    }

    public static int gauss(int n){

        int result;

        // ex)1 홀수 1 ~ 5 = (1+5) * (5-1+1) / 2 + (1+5) / 2 = 6 * 2 + 3 = 15
        // ex)2 짝수 1 ~ 4 = (1+4) * (4-1+1) / 2 = 5 * 2 = 10
        
        result = (1+n) * (n/2) + ( n%2 == 0 ? 0 : (1+n)/2);    

        return result;
    }
}
