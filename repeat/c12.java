package repeat;

import java.util.Scanner;

public class c12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("왼족 아래 직각 이등변 삼각형 출력");
        System.out.print("단수 : ");
        int n = sc.nextInt();

        triangleB(n);
        
    }

    static void triangleB(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
