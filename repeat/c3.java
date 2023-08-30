package repeat;

import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        /*
         * 세 정수 중앙값 구하기
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("세 정수의 중앙값 구하기");
         System.out.print("a의 값 : ");
         int a = sc.nextInt();
         System.out.print("b의 값 : ");
         int b = sc.nextInt();
         System.out.print("c의 값 : ");
         int c = sc.nextInt();

         System.out.println("중앙값은 " + midNum(a, b, c) + " 입니다.");
    }

    static int midNum(int x, int y, int z){
        
        /*
         * x, y, z   x = 2, y = 1, z = 3
         * else 인 경우 z
         */

        // x가 중앙 
        if(( z <= x &&  x <= y) || (y <= x  && x <= z)){
            return x;
        }
        // y가 중앙
        else if(( x > y && y > z) || (z > y && y > x)){
            return y;
        }else{
            return z;
        }
    }
}
