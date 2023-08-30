package repeat;

import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");

        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();
        System.out.print("c의 값 : ");
        int c = sc.nextInt();

        System.out.println("최댓값은 " + maxNum(a, b, c) + " 입니다.");

    }

    static int maxNum(int x, int y, int z){
        int max;

        max = x;
        if(max < y){
            max = y;
        }else if(max < z){
            max = z;
        }
        return max;
    }
}
