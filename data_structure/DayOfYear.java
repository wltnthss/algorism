package data_structure;

import java.util.Scanner;

public class DayOfYear {
    /*
     * 한 해의 경과 일 수 계산
     * 윤년과 평년 2월의 일 수는 해에 따라 달라짐
     */
    static int[][] mdays = {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year){
        // 윤년이면 1 평년이면 0 결과값 리턴
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d){
        int days = d;   // 일 수

        for(int i=1; i<m; i++){
            days += mdays[isLeap(y)][i-1];
        }
        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;  // 재시도

        System.out.println("그 해 경과 일 수 구하기");

        do{
            System.out.print("년:");
            int year = sc.nextInt();
            System.out.print("월:");
            int month = sc.nextInt();
            System.out.print("일:");
            int day = sc.nextInt();

            System.out.printf("그 해 %d일째임. \n", dayOfYear(year, month, day));

            System.out.println("한 번 더? (1.예/0.아니오)");
            retry = sc.nextInt();
        }while(retry == 1);
    }
}
