package repeat;

import java.util.Scanner;

public class c6 {
    
    public static void main(String[] args) {
        System.out.print("n의 값은 ? ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        if(n % 2 == 0){ // 짝수
            sum = (1 + n) * (n / 2);
        }else if(n % 2 == 1){   // 홀수
            sum = (1 + n) * (n / 2) + (n + 1) / 2;
        }
        System.out.println("1부터 " + n + " 까지의 합은? " + sum);
    }
}
