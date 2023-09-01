package repeat;

import java.util.Scanner;

public class c13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("피라미드 출력");
        System.out.print("단수입력 : ");
        int n = sc.nextInt();

        piramid(n);
    }

    static void piramid(int n){
        for(int i=0; i<n; i++){
            
            for(int k=0; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
