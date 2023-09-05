package repeat;

import java.util.Scanner;

public class c17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 a의 모든 요소 합계 구하기");
        System.out.print("배열 a요소 값 : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("배열 a의 모든 요소 합은? " + sumOf(arr) + "입니다.");

    }

    public static int sumOf(int[] a){

        int sum = 0;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum;
    }
}
