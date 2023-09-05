package repeat;

import java.util.Scanner;

public class c18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int a = sc.nextInt();

        int[] arr1 = new int[a];
        for(int i=0; i<arr1.length; i++){
            System.out.print("a[" + i + "] : " );
            arr1[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int b = sc.nextInt();

        int[] arr2 = new int[b];
        for(int i=0; i<arr2.length; i++){
            System.out.print("b[" + i + "] : " );
            arr2[i] = sc.nextInt();
        }

        if(arr1.length != arr2.length){
            System.out.println("배열에 담긴 요솟수가 같지 않습니다.");
        }            


        if(!equalsArr(arr1, arr2)){
            System.out.println("배열 a와 b는 같지 않습니다.");
        }else{
            System.out.println("배열 a와 b는 같습니다.");
        }
    }
    public static boolean equalsArr(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
