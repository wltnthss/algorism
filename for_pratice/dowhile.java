package for_pratice;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        
        // do, while 사용한 1~n 까지의 합 구하기

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구함");

        do{

        System.out.println("n의 값은?");
        n = sc.nextInt();

        } while( n <= 0);

        int sum = 0;

        for(int num = 1; num <= n; num++){
            sum += num;
        }

        System.out.println("1부터 n까지의 합은 " + sum + " 임");

    }
}
