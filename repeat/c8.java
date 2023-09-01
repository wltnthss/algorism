package repeat;

import java.util.Scanner;

public class c8 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a의 값 : ");
        int a = sc.nextInt(); 
        System.out.print("b의 값 : ");
        int b = sc.nextInt();  

        do{
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값 : ");
            b = sc.nextInt();
        }while(a > b);
        
        int result;
        result = b -a;
        System.out.println("b -a 는 " + result + " 입니다.");

    }
}
