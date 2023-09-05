package repeat;

import java.util.Scanner;

public class c15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("키 값은 아래와 같음.");
        for(int i=0; i<n; i++){
            System.out.print("height[" + i + "] : ");
            height[i] = sc.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

    }

    static int maxOf(int[] a){

        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        return max;
    }
}
