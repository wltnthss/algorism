package search;

import java.util.Scanner;

public class seqsearch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i<num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);
    
        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }
    }

    static int seqSearch(int[] x, int num, int ky) {
        
        int i = 0;

        while(true) {
            if(i == num){
                return -1;
            }
            if(x[i] == ky){
                return i;
            }
            i++;
        }
    }
}
