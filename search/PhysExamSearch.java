package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
    
    static class PhyscData {
        private String name;
        private int height;
        private double vision; 

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.height > d2.height) ? 1:
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PhyscData[] x = {
                new PhyscData("Kim", 162, 0.3),
                new PhyscData("Son", 180, 2.0),
                new PhyscData("Park", 174, 0.7),
                new PhyscData("Hong", 161, 0.8),
                new PhyscData("Lee", 184, 0.1),
                new PhyscData("Bae", 153, 0.2),
            };
            System.out.print("몇 cm인 사람을 찾나요? : ");
            int height = sc.nextInt();
            int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0),
            PhyscData.HEIGHT_ORDER);

            if (idx < 0){
                System.out.println("요소가 없습니다.");
            }else{
                System.out.println("x[" + idx + "]에 있습니다.");
                System.out.println("찾은 데이터 : " + x[idx]);
            }
        } 
    }
}
