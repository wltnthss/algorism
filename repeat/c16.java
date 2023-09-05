package repeat;

import java.util.Scanner;

public class c16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt();

        int[] x = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("x[" + i + "] : " );
            x[i] = sc.nextInt();
        }

        System.out.println("요소를 역순으로 정렬했습니다.");

        reverse(x);

        for(int i=0; i<n; i++){
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }

    public static void reverse(int[] x){
        for(int i=0; i<x.length / 2; i++){
            swap(x, i, x.length -i -1);
        }
    }

    public static void swap(int[] x, int a1, int a2){
        int t = x[a1];
        x[a1] = x[a2];
        x[a2] = t;
    }


}
