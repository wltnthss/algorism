package data_structure;

import java.util.Scanner;

public class ReverseArray {
    /*
     * 왼쪽과 오른쪽 요소의 인덱스 과정
     * 왼쪽 n이 7임 0 -> 1 -> 2
     * 오른쪽 n이 7임 6 -> 5 -> 4
     * a[i] 와 a[n -1 -i] 인데 요소 교환이 두 번 일어남
     * x, y, 임의의 변수, t 를 줌으로써 x = t, y = x, t = y 와 같이 교환
     * for(int i=0; i<n/2; i++) -> 교환 횟수 = 요소 개수 / 2 이므로 역순 정렬 알고리즘
     */
    public static void main(String[] args){
        System.out.print("요솟수 : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("요소를 역순으로 정렬했습니다.");
        for(int i=0; i<n; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void swap(int[] ar, int x, int y){
        int t = ar[x];
        ar[x] = ar[y];
        ar[y] = t;
    }

    public static void reverse(int[] a){
        
        for(int i=0; i<a.length / 2; i++){
            swap(a, i, a.length -i -1);
        }
    }
}
