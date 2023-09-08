package repeat;

import java.util.Scanner;

public class c19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[] {1, 2, 3, 4, 5};

        for (int i =0; i < arr.length; i++){
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        System.out.println(); 

        int[] arr2 = arr.clone();

        rcopy(arr, arr2);

        for (int i =0; i < arr2.length; i++){
            System.out.println( "arr2[" + i + "] : " + arr2[i]);
        }
        
        
    }

    static void swap(int[] x, int a, int b){
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    static void rcopy(int[] a, int[] b){
        for(int i=0; i<b.length / 2; i++){
            swap(b, i, b.length-1-i);
        }
        
    }


}
