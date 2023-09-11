package search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class seqsearchsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];


        
        for(int i=0; i<num; i++){

            System.out.print("x[" + i + "] : ");
            arr[i] = sc.nextInt();

            for (int j = 0; j < i; j++) {
 
                if (arr[i] == arr[j]) {  // 중복검사
                    System.out.println("중복되는 수 입니다 다시입력하세요.( 중복숫자 " + arr[j] + ")");
                    i--;
                }
            }
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int result = seqSearch(num, arr, key);

        if(result == -1){
            System.out.print("검색할 값이 배열에 존재하지않습니다.");
        }else{
            System.out.print(key + "은(는) " + "x[" + result + "]에 있습니다.");
        }
        
    }

    private static int seqSearch(int num, int[] arr, int key) {

        int i = 0;

        arr[num] = key;

        while(true){
            if(arr[i] == key){
                break;
            }
            i++;
        }
        return i == num ? -1 : i;
    }
}
