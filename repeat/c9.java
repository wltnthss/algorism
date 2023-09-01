package repeat;

import java.util.Scanner;

public class c9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        String snum = "" + num;

        // System.out.println(snum.length());

        System.out.println("그 수는 " + snum.length() + "자리입니다.");
    }
}
