package for_pratice;

import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        
        System.out.println("피라미드 출력");
        System.out.println("몇 단 출력?? ");

        int n;

        do{
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);

        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=i * 2 -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
