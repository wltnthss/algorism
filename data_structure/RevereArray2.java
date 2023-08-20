package data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class RevereArray2 {
        /*
        * 5 10 73 2 -5 42
        * a[0] 과 a[5] 교환 -> a[i], a[i] -1 - i
        * 42 10 73 2 -5 5 
        * a[1] 과 a[4] 교환
        * 42 -5 73 2 10 5
        * a[2] 과 a[3] 교환
        * 42 -5 2 73 10 5
        * 역순 정렬을 마쳤습니다.
        */
    public static void main(String[] args) {
        int[]arr = {2,5,1,3,9,6,7};
        reverse(arr);
 
    }
    static void swap(int[]a, int index1, int index2) {
        System.out.println(Arrays.toString(a));
        int t = a[index1];
        a[index1] = a[index2];
        a[index2] = t;
        System.out.println("a["+index1+"]과 a["+index2+"]을 교환합니다.");
    }
    static void reverse(int[]a) {
        for(int i = 0; i<a.length/2; i++) {
            swap(a,i,a.length-i-1);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
