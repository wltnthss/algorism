package data_structure;

import java.util.Scanner;

public class CardConvRev {
    
    /*
     * 기수 변환 알고리즘 정리
     * // charAt -> 문자열에서 임의의 문자 액세스용 메서드
     */

     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        int no=0;     // 변환하려고 하는 정수
        int cd=0;     // 정수를 나누는 기수값
        int dno=0;    // 변환 후의 자릿수
        int retry=0;  // 재시도
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어두는 문자 배열

        System.out.println("10진수를 기수 변환함.");

        do{
            do{
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            }while (no < 0);

            do{
                System.out.print("어떤 진수로 변환할까요 ? (2~36 ) : ");
                cd = sc.nextInt();
            } while(cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + "진수로는 ");
            for( int i=dno - 1; i >=0; i--){
                System.out.print(cno[i]);
            }
            System.out.println(" 입니다.");

            System.out.print("한 번 더 할까요? (1. 네/0.아니오) : ");
            retry = sc.nextInt();
        }while(retry == 1);     

     }

     // 정숫값 x를 r진수로 변환 -> 배열 d의 아랫자리부터 넣어두고 자릿수 반환함.
     // x가 나누는 값이고 r이고 진수에 해당함.
     // 배열에 저장되는 digits는 역순으로 1씩 증가하게됨.
     // x가 0이 되면 while문은 반복 종료.
     public static int cardConvR(int x, int r, char[] d){

         int digits = 0;
         String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

         do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
         } while(x != 0);
        return digits;
     }
}
