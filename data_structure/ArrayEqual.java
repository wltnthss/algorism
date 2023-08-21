package data_structure;

import java.util.Scanner;

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
    
        int idx1 = sc.nextInt();

        int[] a = new int[idx1];

        for(int i=0; i<a.length; i++){
            System.out.print("a["+ i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
    
        int idx2 = sc.nextInt();

        int[] b = new int[idx2];

        for(int i=0; i<b.length; i++){
            System.out.print("b["+ i + "] : ");
            b[i] = sc.nextInt();
        }

        System.out.println( 
            "배열 a와 b는 " + (equals(a, b) ? "같습니다." : 
                                            "같지 않습니다.")
        );
        
    }

    public static boolean equals(int[] a, int[] b){

        // 배열의 요소를 비교해서 같지 않으면 false
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }

        // 배열의 길이값을 비교해서 같지 않으면 false
        if(a.length != b.length){
            return false;
        }
        return true;
    }
}
