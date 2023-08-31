package repeat;

import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("n의값 입력 : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
            if(i < n){
                System.out.print(i + " + ");
            }
            if(i == n){
                System.out.print(i + " = " + sum);
            }
        }
    }
}
