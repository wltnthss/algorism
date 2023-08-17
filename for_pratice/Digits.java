package for_pratice;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args){

        // 2자리의 양수(10 ~ 99) 입력 반복문

        System.out.println("2자리의 정수를 입력하세요");

        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("입력 : ");
            n = sc.nextInt();
        }while(n < 10 || n > 99);

        System.out.println("변수 n의 값은 " + n + " 입니다.");
        
    }
}
