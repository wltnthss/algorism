package data_structure;

import java.util.Scanner;

public class MaxOfArray {
    // 배열에서의 최대값 구하는 알고리즘 작성
    public static void main(String[] args) {
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] height = new int[n];
 
        for(int i=0; i<height.length; i++){
            System.out.print("height[" + i + "] : ");
            height[i] = sc.nextInt();
        }
        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }

    public static int maxOf(int[] a){

        int max = a[0];

        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
} 
