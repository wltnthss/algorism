package for_pratice;

import java.util.Scanner;

public class TriangleB {
    public static void main(String[] args) {
        
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력");

        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("몇 단 삼각형입니까? ");
            n = sc.nextInt();
        }while(n <= 0);
        
        triangleB(5);

    }

    public static void triangleB(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
