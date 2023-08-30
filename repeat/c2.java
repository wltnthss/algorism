package repeat;

import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");

        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();
        System.out.print("c의 값 : ");
        int c = sc.nextInt();
        System.out.print("d의 값 : ");
        int d = sc.nextInt();

        System.out.println("최댓값은 " + maxNum(a, b, c, d) + " 입니다.");

    }

    static int maxNum(int x, int y, int z, int k){
        int max;

        /*
         * 1. max = 78 
         * 2. 78 < 98 -> max = 98
         * 3. 98 < 487 -> max = 487
         * 4. 487 < 58 return 487
         * 5. 
         * 
         */
        // max = 1 , 1<5 -> max = 5 , 5 < 77 -> max = 77 -> 77 < 45 -> max = 77

        max = x;

        if(max < y){
            max = y;
        }
        if(max < z){
            max = z;
        }
        if(max < k){
            max = k;
        }
        return max;
    }
}
