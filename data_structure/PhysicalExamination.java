package data_structure;

import java.util.Scanner;

public class PhysicalExamination {
    
    /*
     * 신체 검사 데이터 클래스 배열로 구현
     */
    static final int VMAX = 21;     // 시력 분호 0.0 ~ 0.1 단위로 21개

    static class PhyscData{
        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값
    static double aveHeight(PhyscData[] dat){
        double sum = 0;

        for(int i=0; i<dat.length; i++){
            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    // 시력 분포
    static void distVision(PhyscData[] dat, int[] dist){
        int i = 0;

        dist[i] = 0;
        for(i=0; i<dat.length; i++){
            if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0){
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
            new PhyscData("학생1", 150, 0.1),
            new PhyscData("학생2", 142, 0.7),
            new PhyscData("학생3", 164, 0.5),
            new PhyscData("학생4", 171, 0.4),
            new PhyscData("학생5", 185, 1.1),
            new PhyscData("학생6", 146, 1.5),
            new PhyscData("학생7", 163, 0.4),
        };

        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름     키    시력");
        System.out.println("----------------------");
        for(int i=0; i<x.length; i++){
            System.out.printf("%s%7d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");
        for(int i=0; i<VMAX; i++){
            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
        }
    }
}
