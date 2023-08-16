package for_pratice;
import java.util.*;

class Repeat{
    public static void main(String[] args){
        // 1 ~ n까지의 합 구하기

        Scanner sc = new Scanner(System.in);

        System.out.println("1~n 까지의 합 구하기");
        System.out.println("n의 값은??");

        int n = sc.nextInt();

        int i = 1;
        int sum = 0;    // 합

        while(i <= n){
            sum += i;
            i ++;
        }

        /*
        for문으로는 아래와 같이 사용 가능.
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }
       */

        System.out.println("1부터 n까지의 합은 " + sum + " 입니다.");
    }
}
