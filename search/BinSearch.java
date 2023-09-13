package search;

import java.util.Arrays;
import java.util.Scanner;

public class BinSearch {
     // 이진 검색은 선형 검색보다 더 빠르게 검색할 수 있는 알고리즘
     // 오름차순 또는 내림차순으로 정렬된 배열에서 검색하는 알고리즘임.

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for(int i=0; i<arr.length; i++){
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("배열을 오름차순 정렬합니다.");

        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print("arr[" + i + "] : " + arr[i]);
            System.out.println();
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int result = Arrays.binarySearch(arr, key);

        System.out.println(key + "은(는) arr[" + result + "]에 있습니다." );
     }
}
