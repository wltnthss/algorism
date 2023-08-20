package data_structure;

import java.util.Arrays;

public abstract class ArraySumOf {
    public static void main(String[] args){

        int[] arr = {1, 10, 100, 1000};

        System.out.println("배열 arr의 모든 요소의 합계는 = " + sumOf(arr));
    }

    public static int sumOf(int[] a){

        int sum = 0;
        System.out.println(Arrays.toString(a));

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
