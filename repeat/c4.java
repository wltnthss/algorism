package repeat;

import java.util.Scanner;

public class c4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합 구하기");

        System.out.print("n의 값 : ");
        int x = sc.nextInt();

        int[] arr = new int[x];

        for(int i=0; i< arr.length; i++){
            arr[i] = i+1;
            System.out.println("arr[" + i + "]" + " " + arr[i]);
        }

        System.out.println("1부터 5까지의 합은 " + sum(arr) + "입니다.");
    }

    static int sum(int[] x){

        int sum = 0;

        for(int i=0; i<x.length; i++){
            sum += x[i];
        }
        return sum;
    }
}
